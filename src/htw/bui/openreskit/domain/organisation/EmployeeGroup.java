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

package htw.bui.openreskit.domain.organisation;

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
public class EmployeeGroup extends ResponsibleSubject{

    @JsonProperty("Name")
	private String name;

    /**
     * Constructor without parameter.
     * 
     */
    public EmployeeGroup() {
        super();
    }

   /**
    * Returns the value of the "name" attribute.
    *
    * @return The value of the "name" attribute.
    */
   public String getName() {
      return name;
   }
   /**
    * Sets the value of the "name" attribute.
    *
    * @param name
    *     The value of the "name" attribute.
    */
   public void setName(String name) {
      this.name = name;
   }
}