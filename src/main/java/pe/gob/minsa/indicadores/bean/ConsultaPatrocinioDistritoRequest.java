package pe.gob.minsa.indicadores.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ConsultaPatrocinioDistritoRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer anio;
	private Integer idGrupoServicio;
}