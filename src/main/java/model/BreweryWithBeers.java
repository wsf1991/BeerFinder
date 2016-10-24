//package model;
//
//public class BreweryWithBeers {
//	String name;
//}

package model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BreweryWithBeers {
	private String message;
	private ArrayList<Beer> data;
	
	
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public ArrayList<Beer> getData() {
		return data;
	}



	public void setData(ArrayList<Beer> data) {
		this.data = data;
	}



	@Override
	public String toString() {
		return "BreweryWithBeers [message=" + message + ", data=" + data + "]";
	}
}
