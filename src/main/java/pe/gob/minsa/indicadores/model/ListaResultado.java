package pe.gob.minsa.indicadores.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ListaResultado implements Serializable {

	private static final long serialVersionUID = 1L;
	private String mes;
	private String cantidad;

}