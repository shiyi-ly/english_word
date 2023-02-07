package com.english.word.config.swagger;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Date 2022/3/1 15:40
 * @Created by wlh
 */

@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI

public class SwaggerConfiguration {

//    @Value("${swagger.enable}")
    private Boolean swaggerEnable = true;

    // admin后台
    @Bean
    public Docket createRestApiAdmin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("admin")
                .host("/")
                .apiInfo(apiInfo())
                .enable(swaggerEnable)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.english.word.controller"))
                .paths(PathSelectors.any())
                .build();
    }



    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("english_word")
                .description("english_word API DOCUMENT")
                .termsOfServiceUrl("http://host:port/")
                .contact(new Contact("shiyi", null, null))
                .version("1.0.0")
                .build();
    }

}
