package com.example.docs.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableWebMvc
public class DocConfig {

    //    @Bean
//    public OpenAPI openApiConfig() {
//        return new OpenAPI().info(
//                new Info()
//                        .title("Some Title")
//                        .description("some description")
//                        .version("version 1.0.0")
//        );
//    }
    @Bean
    public OpenAPI openApiConfig() {
        return new OpenAPI().info(apiInfo());
    }

    public Info apiInfo() {
        Info info = new Info();
        info
                .title("Some Title")
                .description("some description")
                .version("version 1.0.0");

        return info;
    }
}
