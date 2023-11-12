package com.celulares.celulares.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.celulares.celulares.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo((ApiInfo) getApiInfo());
    }

    private Object getApiInfo() {

        return new ApiInfo("Celulares",
                "Servicio para venta celualres",
                "1.0.0", "Terminos de Servicios",
                new Contact("Alef", "https:www.google.com", "alef@mail.com"),
                "LICENCE",
                "LICENCE",
                Collections.emptyList());
    }
}
