
package pe.gob.minjus.indicadores.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para permisosPorMenu complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="permisosPorMenu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auditUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aplicacionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rolId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="objetoPadreId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permisosPorMenu", propOrder = {
    "auditUser",
    "aplicacionId",
    "rolId",
    "objetoPadreId"
})
public class PermisosPorMenu {

    protected String auditUser;
    protected Integer aplicacionId;
    protected Integer rolId;
    protected Integer objetoPadreId;

    /**
     * Obtiene el valor de la propiedad auditUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditUser() {
        return auditUser;
    }

    /**
     * Define el valor de la propiedad auditUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditUser(String value) {
        this.auditUser = value;
    }

    /**
     * Obtiene el valor de la propiedad aplicacionId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAplicacionId() {
        return aplicacionId;
    }

    /**
     * Define el valor de la propiedad aplicacionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAplicacionId(Integer value) {
        this.aplicacionId = value;
    }

    /**
     * Obtiene el valor de la propiedad rolId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRolId() {
        return rolId;
    }

    /**
     * Define el valor de la propiedad rolId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRolId(Integer value) {
        this.rolId = value;
    }

    /**
     * Obtiene el valor de la propiedad objetoPadreId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjetoPadreId() {
        return objetoPadreId;
    }

    /**
     * Define el valor de la propiedad objetoPadreId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjetoPadreId(Integer value) {
        this.objetoPadreId = value;
    }

}
