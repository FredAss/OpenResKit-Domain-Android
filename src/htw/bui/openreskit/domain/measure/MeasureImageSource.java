package htw.bui.openreskit.domain.measure;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MeasureImageSource 
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

	@JsonProperty("BinarySource")
	private String binarySource;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBinarySource() {
		return binarySource;
	}

	public void setBinarySource(String binarySource) {
		this.binarySource = binarySource;
	}
}
