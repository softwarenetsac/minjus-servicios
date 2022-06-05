package pe.gob.minjus.indicadores.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Seguridad implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String success;
	private String message;
	private String code;
	private String operation;
	private String json;

}
