package pe.gob.minjus.indicadores.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ConsultaEventoTemarioRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer anio;
	private Integer idDistrito;
	private Integer idSede;
	private String idTipoEvento;
	private Integer idMes;
	private Integer idTemario;
}
