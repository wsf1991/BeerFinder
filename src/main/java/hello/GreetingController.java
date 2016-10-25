package hello;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import model.Beer;
import model.BeerStyle;
import model.BreweryWithBeers;
import model.LocationBreweryResponse;
import model.LocationBreweryResponseData;
import model.Styles;

@Controller
public class GreetingController {

    
	@RequestMapping("/")
    public String index(Model model) {
		RestTemplate restTemplate = new RestTemplate();
		String apiKey = System.getenv("BREWERYDB_API_KEY");
		Styles styles = restTemplate.getForObject("http://api.brewerydb.com/v2/styles?key="+apiKey, Styles.class);
    	System.out.println(styles.toString());
	// call http://api.brewerydb.com/v2/styles?key=61bccbe6de4c3438aea6236b57c8e65f api to get the 170 style id&names; 
    	
	    model.addAttribute("styles", styles.getData());
        return "index";
    }

	

	@RequestMapping(value = "/getbeers", method = RequestMethod.POST)
    public String getbeers(@RequestParam(value="zipcode", required=true, defaultValue="11224") String zipCode, @RequestParam(value="styleId", required=true, defaultValue="-1") int styleId, Model model) {
        // call api  to get json data
    	 //convert json data to a type that Java can recognize. i.e String, int, ArrayList<String>...
    	
    	/* get breweries based on zip code */
    	RestTemplate restTemplate = new RestTemplate();
    	String apiKey = System.getenv("BREWERYDB_API_KEY");
    	LocationBreweryResponse locationBreweryResponse = restTemplate.getForObject("http://api.brewerydb.com/v2/locations?key="+apiKey+"&postalCode="+zipCode, LocationBreweryResponse.class);
    	System.out.println(locationBreweryResponse.toString());
    	
    	// create a empty array of string, to store the results
    	ArrayList<Beer> result = new ArrayList<Beer>();
    	
    	//based on a list of breweries id, call rest api to get the all the beers
    	ArrayList<LocationBreweryResponseData> breweries = locationBreweryResponse.getData();
    	if (breweries == null) {
    		model.addAttribute("beerNames", result);
    		return "greeting";
    	}
    	for (int i = 0; i < breweries.size(); i++) {
    		String breweryId = breweries.get(i).getBreweryId();
    		
    		// call rest api to get beers.

    		BreweryWithBeers breweryWithBeers = restTemplate.getForObject("http://api.brewerydb.com/v2/brewery/"+breweryId+"/beers?key="+apiKey, BreweryWithBeers.class);
        	System.out.println(breweryWithBeers.toString());
    		// for each beer, add its name to result
        	for(int k=0; k<breweryWithBeers.getData().size();k++) {
        		
        		if((breweryWithBeers.getData().get(k).getStyle().getId() == styleId || styleId == -1) && breweryWithBeers.getData() != null ) {
        			result.add(breweryWithBeers.getData().get(k));
        		}
        	}

    	}
    	
    	// pass the data of backend to front end template
        model.addAttribute("beerNames", result);
        return "greeting";
    }

}