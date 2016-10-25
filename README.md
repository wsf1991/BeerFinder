# BeerFinder
It's a web application to find and share beers based on location and personal beer style.


#Introduction

This repository holds a web application of looking for beers based on location and personal preference. I used java springboot(backend),css bootstrap responsive template and javascript.
By calling the drewerydb.com API, this web application can get data from the drewery database for users. I used the googlemap API to get current location and zipcode. I used brewery API to get the breweries in the specific area. I used the beer API to get all the beers in the breweries. I used the style API to find all the beer styles.
I used twitter share buttons to post beers on social websites.
I used css bootstrap to make the website responsive.


##Table of Contents

1. [Architecture](#architecture)
2. [Workflow](#workflow)
3. [Features](#features)
4. [Roadmap](#roadmap)
5. [Contributing to the project](#contributing)
6. [Reference](#reference)


#Architecture
The web application uses MVC web architecture.

![architecture](https://github.com/MassaLx/BeerFinder/blob/master/src/main/resources/Architecture.png)

The browser(front-end) sends request to controller(back-end). The controller fetches data via API. Then the model injects data to template to render into view html.

   Browser ------> request(frontend) ----->   controller(backend) ---------> response(frontend)
                                              
                                                                             
                                                                             

#Workflow
1. Download and install Eclpise.
2. Download Java SE Development Kit 8.
3. Run the Eclpise and set jdk1.8.
4. Import project --> choose "maven" --> choose "existing maven project".
5. Right click the pom.xml --> choose "Run as" --> choosee "maven install"
6. Right click the Applocation.java in src/main/java/hello --> choose "Run as" --> choose "Run configuration" --> choose          "Environment" --> choose "New..." --> type in "BREWERYDB_API_KEY" as name and "61bccbe6de4c3438aea6236b57c8e65f" as key        -->click "Run" button.
7. Open the browser, type in the url "http://localhost:8080/".
8. Wait for about 5 seconds for the automatically detection of zipcode, you can also type in another zipcode where you want to    find the beers.
9. Choose your favourite beer style in the dropdown list then click submit.
10.If there're some breweries, the beers will be shown, click the twitt button to share.





#Features

1. Ability to find beer based on location and personal beer preference.
2. Automatically geolocation detection for current location and put the zipcode in the type-in blank.
3. Ability to share the specific beer on twitter.
4. Responsive (looks great on all screen sizes.


#Roadmap

1. Add beer page to show the detailed information of specific beer.
2. Make the frontend webpages more beautiful.
3. Add some new functions, for example finding beers with city name.

#Contributing
Everyone is encouraged to help improved this project.

The master branch has the latest stable release. development happens in the develop branch (or feature branches that get merged into develo branch). So please check if want you to develop is already in the develop branch.



##Submitting an Issue

I use the [GitHub issue tracker](https://github.com/MassaLx/BeerFinder/issues) to track bugs and features. Ideally, a bug report should include a pull request with failing specs, and maybe even a fix!

##Submitting a Pull Request

1. Fork the project.
2. Create a topic branch.
3. Implement your feature or bug fix.
4. Commit and push your changes.
5. Submit a pull request (to the development branch).

#Reference

1. https://developer.mozilla.org/en-US/docs/Web/API/Geolocation/getCurrentPosition
   Use the API to get current location.
2. https://dev.twitter.com/web/tweet-button/parameters
  Make the share button.
3. https://jsonformatter.curiousconcept.com/
  Check the json data.
4. http://www.w3schools.com/
  Set up the frontend.
5. http://getbootstrap.com/css/
  Set up the frontend.
6. https://spring.io/guides/gs/spring-boot/#scratch
  Set up the backend.
7. https://springframework.guru/spring-boot-web-application-part-4-spring-mvc/
  Set up the backend.
