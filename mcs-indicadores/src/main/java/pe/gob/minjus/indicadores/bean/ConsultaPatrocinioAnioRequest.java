package pe.gob.minjus.indicadores.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ConsultaPatrocinioAnioRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idGrupoServicio;
	private Integer idDistrito;
	private Integer idSede;
}
