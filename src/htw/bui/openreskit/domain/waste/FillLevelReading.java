/**
 * Copyright 2005-2013 Restlet S.A.S.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL
 * 1.0 (the "Licenses"). You can select the license that you prefer but you may
 * not use this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package htw.bui.openreskit.domain.waste;


import htw.bui.openreskit.domain.organisation.ScheduledTask;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="http://localhost:7000/OpenResKitHub/$metadata">Metadata of the target OData service</a>
*
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="odata.type")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FillLevelReading extends ScheduledTask implements Comparable<FillLevelReading> {

		
	@JsonProperty("FillLevel")
	private double fillLevel;
	
	@JsonProperty("ReadingContainer")
    private WasteContainer readingContainer;

	@JsonProperty
	private boolean manipulated;

	public boolean isManipulated() {
		return manipulated;
	}
	public void setManipulated(boolean manipulated) {
		this.manipulated = manipulated;
	}
	
	public int compareTo(FillLevelReading fr) 
	{
		return this.getDueDate().compareTo(fr.getDueDate());
	}
    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public FillLevelReading() {
        super();
    }

   /**
    * Returns the value of the "fillLevel" attribute.
    *
    * @return The value of the "fillLevel" attribute.
    */
   public double getFillLevel() {
      return fillLevel;
   }
   /**
    * Returns the value of the "readingContainer" attribute.
    *
    * @return The value of the "readingContainer" attribute.
    */
   public WasteContainer getReadingContainer() {
      return readingContainer;
   }
   
   /**
    * Sets the value of the "fillLevel" attribute.
    *
    * @param fillLevel
    *     The value of the "fillLevel" attribute.
    */
   public void setFillLevel(double fillLevel) {
      this.fillLevel = fillLevel;
   }
   /**
    * Sets the value of the "readingContainer" attribute.
    *
    * @param readingContainer"
    *     The value of the "readingContainer" attribute.
    */
   public void setReadingContainer(WasteContainer readingContainer) {
      this.readingContainer = readingContainer;
   }

}