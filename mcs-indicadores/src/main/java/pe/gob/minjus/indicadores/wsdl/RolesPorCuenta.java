
package pe.gob.minjus.indicadores.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rolesPorCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rolesPorCuenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auditUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuentaId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="aplicacionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rolesPorCuenta", propOrder = {
    "auditUser",
    "cuentaId",
    "aplicacionId"
})
public class RolesPorCuenta {

    protected String auditUser;
    protected Integer cuentaId;
    protected Integer aplicacionId;

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
     * Obtiene el valor de la propiedad cuentaId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCuentaId() {
        return cuentaId;
    }

    /**
     * Define el valor de la propiedad cuentaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCuentaId(Integer value) {
        this.cuentaId = value;
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

}
