package pe.gob.minjus.indicadores.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ConsultaPatrocinioNuevoGrupoServicioRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String anio;
	private Integer idMes;
	private Integer idTipoDelito;
	private Integer idDistrito;
	
}
