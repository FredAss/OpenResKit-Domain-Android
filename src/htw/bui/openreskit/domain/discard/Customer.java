package htw.bui.openreskit.domain.discard;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

	@JsonProperty("Id")
	private int id;
	@JsonProperty("Name")
	private String name;

	public Customer(int id) {
		super();
		this.id = id;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
}
