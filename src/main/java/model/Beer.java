//package model;
//
//public class Beer {
//	String id;
//	String name;
//}
package model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Beer {
	private String id;
	private String name;
	private BeerStyle style;
	
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
	public BeerStyle getStyle() {
		return style;
	}
	public void setStyle(BeerStyle style) {
		this.style = style;
	}
	@Override
	public String toString() {
		return "Beer [id=" + id + ", name=" + name + ", style=" + style + "]";
	}
	
	
}
