
package pe.gob.minjus.indicadores.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://service.ws.security.sgsi.minjus.gob.pe/")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private pe.gob.minjus.indicadores.wsdl.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception_Exception(String message, pe.gob.minjus.indicadores.wsdl.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Exception_Exception(String message, pe.gob.minjus.indicadores.wsdl.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: pe.gob.minjus.indicadores.wsdl.Exception
     */
    public pe.gob.minjus.indicadores.wsdl.Exception getFaultInfo() {
        return faultInfo;
    }

}
