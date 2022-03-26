package pe.gob.minsa.indicadores.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ConsultaPatrocinioRangoEdadRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer edadDesde;
	private Integer edadHasta;
	private String anio;
	private Integer idGrupoServicio;
	private Integer idDistrito;
	private Integer idSede;
	
}
