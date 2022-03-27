package pe.gob.minjus.indicadores.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConsultaGrupoServicio implements Serializable {

	private static final long serialVersionUID = 1L;
	private String grupoServicio;
	private int enero;
	private int febrero;
	private int marzo;
}
