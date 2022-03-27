package pe.gob.minjus.indicadores.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ConsultaAnualRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer anio;
	private Integer idDistrito;
	private Integer idSede;
}
