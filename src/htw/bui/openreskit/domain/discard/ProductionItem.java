package htw.bui.openreskit.domain.discard;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductionItem 
{

	@JsonProperty("Id")
	private int id;
	
	@JsonProperty("ItemNumber")
	private String itemNumber;
    
	@JsonProperty("ItemName")
	private String itemName;
    
	@JsonProperty("ItemDescription")
	private String itemDescription;
	
	@JsonProperty("ToolNumber")
	private String toolNumber;
	
	@JsonProperty("ChangeIndex")
	private String changeIndex;
	
	@JsonProperty("Material")
	private String material;
	
	@JsonProperty("Customer")
	private Customer customer;
	
	@JsonProperty("ReferenceNumber1")	
	private String referenceNumber1;
    
	@JsonProperty("ReferenceNumber2")
	private String referenceNumber2;
	
	@JsonProperty("ItemCategory")
	private int itemCategory;
    
	@JsonProperty("InspectionAttributes")
	private List<InspectionAttribute> inspectionAttributes;

	
	public ProductionItem() 
	{
		super();
	}

	@Override
	public String toString() 
	{
		return itemName + ", " + itemNumber;
	}
	public ProductionItem(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public String getToolNumber() {
		return toolNumber;
	}

	public String getChangeIndex() {
		return changeIndex;
	}

	public String getMaterial() {
		return material;
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getReferenceNumber1() {
		return referenceNumber1;
	}

	public String getReferenceNumber2() {
		return referenceNumber2;
	}

	public int getItemCategory() {
		return itemCategory;
	}

	public List<InspectionAttribute> getInspectionAttributes() {
		return inspectionAttributes;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public void setToolNumber(String toolNumber) {
		this.toolNumber = toolNumber;
	}

	public void setChangeIndex(String changeIndex) {
		this.changeIndex = changeIndex;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setReferenceNumber1(String referenceNumber1) {
		this.referenceNumber1 = referenceNumber1;
	}

	public void setReferenceNumber2(String referenceNumber2) {
		this.referenceNumber2 = referenceNumber2;
	}

	public void setItemCategory(int itemCategory) {
		this.itemCategory = itemCategory;
	}

	public void setInspectionAttributes(List<InspectionAttribute> inspectionAttributes) {
		this.inspectionAttributes = inspectionAttributes;
	}
    
}
