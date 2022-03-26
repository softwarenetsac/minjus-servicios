package pe.gob.minsa.indicadores.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ListaUsuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idUsuario;
	private int tipoDocumento;
	private String numeroDocumento;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int idGenero;
	private String correo;
	private int idRol;	
	private String rol;
	private String fechaVigencia;
	private int estado;
	private int idDepedencia;
	private int idDisa;
	private String idRed;
	private String idMicroRed;	
	private int idEstablecimiento;
	private String idunidadejecutora;
}
