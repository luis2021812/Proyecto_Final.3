package com.Control.asistencias;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AsistenciasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsistenciasApplication.class, args);
	}
	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.Control.asistencias"))
				.build()
				.apiInfo(apiDetails());
	}
	private ApiInfo apiDetails(){
		return new ApiInfoBuilder()
				.title("Api Control De Asistencias")
				.contact(new Contact("Luis","no-url", "myemail"))
				.description("Tomar Asistencias")
				.build();
	}

}


