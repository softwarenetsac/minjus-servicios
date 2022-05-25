package pe.gob.minjus.indicadores.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.awt.print.Pageable;
import java.util.Date;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	public static final String AUTHORIZATION_HEADER = "Authorization";
	
	@Bean
	public Docket defApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("pe.gob.minjus.indicadores"))
				.paths(regex("/servicios/v1.0.*"))
				.build().apiInfo(metaData())
				.forCodeGeneration(true)
				.genericModelSubstitutes(ResponseEntity.class).ignoredParameterTypes(Pageable.class)
				.ignoredParameterTypes(java.sql.Date.class)
				.directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
				.directModelSubstitute(java.time.ZonedDateTime.class, Date.class)
				.directModelSubstitute(java.time.LocalDateTime.class, Date.class)
				.useDefaultResponseMessages(false);
	}

//	.securityContexts(Lists.newArrayList(securityContext())).securitySchemes(Lists.newArrayList(apiKey()))	

	private ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("BackEnd de indicadores ")
				.description("Api destinada consulta de servicios internos.")
				.termsOfServiceUrl("Términos del Servicio")
				.version("1.0")
				.contact(new Contact("JMartin", "www.google.com", "jhonmartinllm@gmail.com"))
				.license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
				.build();

	}
	
	
//	private ApiKey apiKey() {
//		return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
//	}

//	private SecurityContext securityContext() {
//		return SecurityContext.builder().securityReferences(defaultAuth()).forPaths(PathSelectors.regex("/servicios/v1.0.*"))
//				.build();
//	}

//	List<SecurityReference> defaultAuth() {
//		AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
//		AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//		authorizationScopes[0] = authorizationScope;
//		return Lists.newArrayList(new SecurityReference("JWT", authorizationScopes));
//	}
	
}
