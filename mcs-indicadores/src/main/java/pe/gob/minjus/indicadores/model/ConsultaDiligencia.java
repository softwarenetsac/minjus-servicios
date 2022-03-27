package pe.gob.minjus.indicadores.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConsultaDiligencia implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tipo;
	private String mes;
	private int cantidad;

}
