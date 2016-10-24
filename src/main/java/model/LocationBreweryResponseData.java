package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationBreweryResponseData {
	private String id;
	private String name;
	private String breweryId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreweryId() {
		return breweryId;
	}
	public void setBreweryId(String breweryId) {
		this.breweryId = breweryId;
	}
	
	@Override
    public String toString() {
        return "LocationBreweryResponseData{" +
                "id='" + id + '\'' +
                ", name=" + name + '\''+
                ", breweryId=" + breweryId + 
                '}';
    }
}
