package pe.gob.minsa.indicadores.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBeanGeneric {

	private String codigo;
	private String mensaje;
	private Object datos;
	
	public static ResponseBeanGeneric error(String msg){
		return new ResponseBeanGeneric("6000", msg, null);
	}
	
}
