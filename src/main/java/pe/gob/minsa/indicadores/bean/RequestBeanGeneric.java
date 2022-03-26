package pe.gob.minsa.indicadores.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class RequestBeanGeneric implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer fechaInicio;
	private Integer fechaFin;
}
