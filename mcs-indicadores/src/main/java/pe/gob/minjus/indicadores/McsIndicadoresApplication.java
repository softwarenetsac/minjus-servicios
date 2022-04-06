package pe.gob.minjus.indicadores;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication
//public class McsIndicadoresApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(McsIndicadoresApplication.class, args);
//	}
//
//}

@EnableScheduling
@SpringBootApplication
public class McsIndicadoresApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {		
		return builder.sources(McsIndicadoresApplication.class);
	}

//	public static void main(String[] args) {
//		SpringApplication.run(McsActualizaIndicadoresApplication.class, args);
//	}

}