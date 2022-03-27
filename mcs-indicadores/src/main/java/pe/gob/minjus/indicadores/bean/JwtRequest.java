package pe.gob.minjus.indicadores.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class JwtRequest implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String contrasenia;
}
