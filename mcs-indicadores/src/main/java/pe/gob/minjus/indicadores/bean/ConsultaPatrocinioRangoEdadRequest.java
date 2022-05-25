package pe.gob.minjus.indicadores.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ConsultaPatrocinioRangoEdadRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String rangoEdad;
	private Integer mes;
	private String anio;	
	private Integer idGrupoServicio;
	private Integer idDistrito;
	private Integer idSede;

}
