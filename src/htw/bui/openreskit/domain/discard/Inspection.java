package htw.bui.openreskit.domain.discard;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import htw.bui.openreskit.domain.organisation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Inspection 
{
	@JsonProperty("Id")
	private int id;

	@JsonProperty
	private int internalId;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("ProductionDate")
	private Date productionDate;

	@JsonProperty("InspectionDate")
	private Date inspectionDate;

	@JsonProperty("ProductionShift")
	private int productionShift;

	@JsonProperty("InspectionShift")
	private int inspectionShift;

	@JsonProperty("InspectionType")
	private int inspectionType;

	@JsonProperty("SampleSize")
	private int inspectionFrequencyOrSampleSize;

	@JsonProperty("TotalAmount")
	private int totalAmount;

	@JsonProperty("Unit")
	private String totalAmountUnit;

	@JsonProperty("Description")
	private String description;

	@JsonProperty("ResponsibleSubject")
	private ResponsibleSubject responsibleSubject;

	@JsonProperty("ProductionItem")
	private ProductionItem productionItem;

	@JsonProperty("DiscardItems")
	private List<DiscardItem> discardItems;

	@JsonProperty("Finished")
	private boolean finished;
	
	@JsonProperty
	private boolean manipulated;

	public boolean isManipulated() {
		return manipulated;
	}
	public void setManipulated(boolean manipulated) {
		this.manipulated = manipulated;
	}

	public Inspection(Inspection templateInspection) 
	{
		this.name = templateInspection.name;
		this.productionDate = templateInspection.productionDate;
		this.productionShift = templateInspection.productionShift;
		this.inspectionShift = templateInspection.inspectionShift;
		this.inspectionType = templateInspection.inspectionType;
		this.inspectionFrequencyOrSampleSize = templateInspection.inspectionFrequencyOrSampleSize;
		this.totalAmount = templateInspection.totalAmount;
		this.totalAmountUnit = templateInspection.totalAmountUnit;
		this.description = templateInspection.description;
		this.responsibleSubject = templateInspection.responsibleSubject;
		this.productionItem = templateInspection.productionItem;
	}

	public Inspection() 
	{

	}

	public int getInternalId() {
		return internalId;
	}

	public void setInternalId(int internalID) {
		this.internalId = internalID;
	}

	public Inspection(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public Date getInspectionDate() {
		return inspectionDate;
	}

	public int getProductionShift() {
		return productionShift;
	}

	public int getInspectionShift() {
		return inspectionShift;
	}

	public int getInspectionType() {
		return inspectionType;
	}

	public int getInspectionFrequencyOrSampleSize() {
		return inspectionFrequencyOrSampleSize;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public String getTotalAmountUnit() {
		return totalAmountUnit;
	}

	public String getDescription() {
		return description;
	}

	public ResponsibleSubject getResponsibleSubject() {
		return responsibleSubject;
	}

	public ProductionItem getProductionItem() {
		return productionItem;
	}

	public List<DiscardItem> getDiscardItems() {
		return discardItems;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	public void setProductionShift(int productionShift) {
		this.productionShift = productionShift;
	}

	public void setInspectionShift(int inspectionShift) {
		this.inspectionShift = inspectionShift;
	}

	public void setInspectionType(int inspectionType) {
		this.inspectionType = inspectionType;
	}

	public void setInspectionFrequencyOrSampleSize(
			int inspectionFrequencyOrSampleSize) {
		this.inspectionFrequencyOrSampleSize = inspectionFrequencyOrSampleSize;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setTotalAmountUnit(String totalAmountUnit) {
		this.totalAmountUnit = totalAmountUnit;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setResponsibleSubject(ResponsibleSubject responsibleSubject) {
		this.responsibleSubject = responsibleSubject;
	}

	public void setProductionItem(ProductionItem productionItem) {
		this.productionItem = productionItem;
	}

	public void setDiscardItems(List<DiscardItem> discardItems) {
		this.discardItems = discardItems;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}


}
