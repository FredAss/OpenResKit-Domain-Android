package htw.bui.openreskit.domain.discard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscardImageSource 
{
	
	@JsonProperty("Id")
	private int id;
	
	@JsonProperty("BinarySource")
	private String binarySource;

	@JsonIgnore
	private byte[] image;

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}


	
	public DiscardImageSource() {
		super();
	}

	public DiscardImageSource(int id) {
		super();
		this.id = id;
	}
	
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
