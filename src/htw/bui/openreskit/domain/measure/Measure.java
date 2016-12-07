package htw.bui.openreskit.domain.measure;

import java.util.Date;
import java.util.List;

import htw.bui.openreskit.domain.organisation.Document;
import htw.bui.openreskit.domain.organisation.ResponsibleSubject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Measure
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

	public boolean isManipulated() {
		return manipulated;
	}
	public void setManipulated(boolean manipulated) {
		this.manipulated = manipulated;
	}

	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Description")
	private String description;
	
	@JsonProperty("Evaluation")
	private String evalutation;

	@JsonProperty("EvaluationRating")
	private double evaluationRating;

	@JsonProperty("EntryDate")
	private Date entryDate;

	@JsonProperty("DueDate")
	private Date dueDate;

	@JsonProperty("CreationDate")
	private Date creationDate;
	
	@JsonProperty("ResponsibleSubject")
	private ResponsibleSubject responsibleSubject;
	
	@JsonProperty("Status")
	private int status;
	
	@JsonProperty("Priority")
	private int priority;

	@JsonProperty("MeasureImageSource")
	private MeasureImageSource imageSource;
	
	@JsonProperty("AttachedDocuments")
	private List<Document> attachedDocuments;

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

	public String getEvalutation() {
		return evalutation;
	}

	public void setEvalutation(String evalutation) {
		this.evalutation = evalutation;
	}

	public double getEvaluationRating() {
		return evaluationRating;
	}

	public void setEvaluationRating(double evaluationRating) {
		this.evaluationRating = evaluationRating;
	}
	
	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public ResponsibleSubject getResponsibleSubject() {
		return responsibleSubject;
	}

	public void setResponsibleSubject(ResponsibleSubject responsibleSubject) {
		this.responsibleSubject = responsibleSubject;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public MeasureImageSource getImageSource() {
		return imageSource;
	}

	public void setImageSource(MeasureImageSource imageSource) {
		this.imageSource = imageSource;
	}

	public List<Document> getAttachedDocuments() {
		return attachedDocuments;
	}

	public void setAttachedDocuments(List<Document> attachedDocuments) {
		this.attachedDocuments = attachedDocuments;
	}
		
}

