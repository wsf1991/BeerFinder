package model;

import java.util.ArrayList;

public class Styles {
	private String message;
	private ArrayList<BeerStyle> data;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ArrayList<BeerStyle> getData() {
		return data;
	}
	public void setData(ArrayList<BeerStyle> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Styles [message=" + message + ", data=" + data + "]";
	}
}
