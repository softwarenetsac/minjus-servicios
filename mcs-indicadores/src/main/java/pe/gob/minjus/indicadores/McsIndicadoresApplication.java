package pe.gob.minjus.indicadores;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class McsIndicadoresApplication
  extends SpringBootServletInitializer
{
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
  {
    return builder.sources(new Class[] { McsIndicadoresApplication.class });
  }
}


