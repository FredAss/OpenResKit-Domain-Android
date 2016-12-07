package htw.bui.openreskit.domain.discard;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscardItem 
{
	@JsonProperty("Id")
	private int id;

	@JsonProperty("Description")
	private String description;

	@JsonProperty("Quantity")
	private int quantity;

	@JsonProperty("InspectionAttribute")
	private InspectionAttribute inspectionAttribute;


	@JsonProperty
	private int internalID;


	public int getInternalID() {
		return internalID;
	}

	public void setInternalID(int internalID) {
		this.internalID = internalID;
	}

	public DiscardItem() {
		
		super();
		// TODO Auto-generated constructor stub
	}

	public DiscardItem(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public InspectionAttribute getInspectionAttribute() {
		return inspectionAttribute;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setInspectionAttribute(InspectionAttribute inspectionAttribute) {
		this.inspectionAttribute = inspectionAttribute;
	}

}
