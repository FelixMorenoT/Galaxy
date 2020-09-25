package com.galaxy;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class GalaxyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalaxyApiApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(usersApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.galaxy"))
				.build();
	}
	
	private ApiInfo usersApiInfo() {
	        return new ApiInfo("Galaxy Rest Api", "Api to Handle backend of Galaxy App", "1.0", "", new Contact("Felix Moreno", "https://github.com/FelixMorenoT", "felixmorenot18@hotmail.com"), "", "", Collections.emptyList());
	    }
		
}
