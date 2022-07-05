package pe.gob.minjus.indicadores.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ConsultaPatrocinioNuevoTipoDelitoRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String anio;
	private Integer idTipoDelito;
	private Integer idGrupoServicio;
	private Integer idDistrito;

}
