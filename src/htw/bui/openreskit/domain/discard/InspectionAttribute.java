package htw.bui.openreskit.domain.discard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InspectionAttribute 
{
	@JsonProperty("Id")
	private int id;
	
	@JsonProperty("Number")
	private String number;
	
	@JsonProperty("Description")
	private String description;
	
	@JsonProperty("DiscardImageSource")
	private DiscardImageSource discardImageSource;
	
	@JsonProperty
	private boolean manipulated;

	public boolean isManipulated() {
		return manipulated;
	}
	public void setManipulated(boolean manipulated) {
		this.manipulated = manipulated;
	}

	public InspectionAttribute() {
		super();
	}

	public InspectionAttribute(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DiscardImageSource getDiscardImageSource() {
		return discardImageSource;
	}

	public void setDiscardImageSource(DiscardImageSource discardImageSource) {
		this.discardImageSource = discardImageSource;
	}
}
