package pe.gob.minjus.indicadores.config;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PropertiesBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Value("${name.db}")
	private String nameDb;

}
