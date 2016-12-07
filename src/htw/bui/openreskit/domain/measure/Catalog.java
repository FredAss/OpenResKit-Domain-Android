package htw.bui.openreskit.domain.measure;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Catalog implements Cloneable
{
	@JsonProperty("Id")
	private int id;

	@JsonProperty
	private int internalId;

	public int getInternalId() {
		return internalId;
	}

	public void setInternalId(int internalId) {
		this.internalId = internalId;
	}

	@JsonProperty
	private boolean manipulated;

	public boolean isManipulated() 
	{
		return manipulated;
	}
	
	public void setManipulated(boolean manipulated) 
	{
		this.manipulated = manipulated;
	}
	
	@JsonProperty("Name")
	private String name;

	@JsonProperty("Description")
	private String description;

	@JsonProperty("Measures")
	private List<Measure> measures;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Measure> getMeasures() {
		return measures;
	}

	public void setMeasures(List<Measure> measures) {
		this.measures = measures;
	}

	@Override
	public Catalog clone() throws CloneNotSupportedException 
	{
		return (Catalog) super.clone();
	}
}
