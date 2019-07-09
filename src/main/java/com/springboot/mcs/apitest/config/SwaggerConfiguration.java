package com.springboot.mcs.apitest.config;

import org.apache.logging.log4j.core.filter.RegexFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	 @Bean
	    public Docket integracionSihceRefconApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()                 
	                .apis(RequestHandlerSelectors.basePackage("com.springboot.mcs.apitest.controller"))
	                .paths(regex("/persona.*"))
	                .build()
	                .apiInfo(metaData());
	    }
	    private ApiInfo metaData() {
	        return new ApiInfoBuilder()
	        		.title("Servicio de Prueba")
	                .description("Servicio")
	                .termsOfServiceUrl("Términos del servicio")
	                .version("1.0")
	                .contact(new Contact("New Horizon", "http://www.new-horizon.com", "kevin.pinchi.garcia@gmail.com"))
	                .license("Apache License Version 2.0")
	                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
	                .build();
	    }

	
}
