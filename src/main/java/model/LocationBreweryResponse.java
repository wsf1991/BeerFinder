package model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationBreweryResponse {
	private String status;
	private ArrayList<LocationBreweryResponseData> data;
	
	public LocationBreweryResponse() {
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<LocationBreweryResponseData> getData() {
		return data;
	}

	public void setData(ArrayList<LocationBreweryResponseData> data) {
		this.data = data;
	}
	
	@Override
    public String toString() {
        return "LocationBreweryResponse{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
