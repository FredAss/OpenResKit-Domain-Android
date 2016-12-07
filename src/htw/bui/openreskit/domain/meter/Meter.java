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

package htw.bui.openreskit.domain.meter;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import htw.bui.openreskit.domain.organisation.MapPosition;

/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="http://141.45.165.40:7000/OpenResKitHub/$metadata">Metadata of the target OData service</a>
*
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meter {

	@JsonProperty("Id")
	private int id;
	
	@JsonProperty("Barcode")
	private String barcode;

	@JsonProperty("Number")
    private String number;
    
	@JsonProperty("Unit")
    private String unit;
    
	@JsonProperty("MapPosition")
    private MapPosition mapPosition;

    /**
     * Constructor without parameter.
     * 
     */
    public Meter() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public Meter(int id) {
        this();
        this.id = id;
    }

   /**
    * Returns the value of the "barcode" attribute.
    *
    * @return The value of the "barcode" attribute.
    */
   public String getBarcode() {
      return barcode;
   }
   /**
    * Returns the value of the "id" attribute.
    *
    * @return The value of the "id" attribute.
    */
   public int getId() {
      return id;
   }
   /**
    * Returns the value of the "number" attribute.
    *
    * @return The value of the "number" attribute.
    */
   public String getNumber() {
      return number;
   }
   /**
    * Returns the value of the "unit" attribute.
    *
    * @return The value of the "unit" attribute.
    */
   public String getUnit() {
      return unit;
   }
   /**
    * Returns the value of the "mapPosition" attribute.
    *
    * @return The value of the "mapPosition" attribute.
    */
   public MapPosition getMapPosition() {
      return mapPosition;
   }
   
   /**
    * Sets the value of the "barcode" attribute.
    *
    * @param barcode
    *     The value of the "barcode" attribute.
    */
   public void setBarcode(String barcode) {
      this.barcode = barcode;
   }
   /**
    * Sets the value of the "id" attribute.
    *
    * @param id
    *     The value of the "id" attribute.
    */
   public void setId(int id) {
      this.id = id;
   }
   /**
    * Sets the value of the "number" attribute.
    *
    * @param number
    *     The value of the "number" attribute.
    */
   public void setNumber(String number) {
      this.number = number;
   }
   /**
    * Sets the value of the "unit" attribute.
    *
    * @param unit
    *     The value of the "unit" attribute.
    */
   public void setUnit(String unit) {
      this.unit = unit;
   }
   /**
    * Sets the value of the "mapPosition" attribute.
    *
    * @param mapPosition"
    *     The value of the "mapPosition" attribute.
    */
   public void setMapPosition(MapPosition mapPosition) {
      this.mapPosition = mapPosition;
   }

}