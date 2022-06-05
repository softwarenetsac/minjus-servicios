package pe.gob.minjus.indicadores.config;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PropertiesBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Value("${url.servicio.wsdl}")
	private String urlServicioWsdl;
	
	@Value("${url.servicio}")
	private String urlServicio;
	
	@Value("${id.app}")
	private Integer idApp;

}
