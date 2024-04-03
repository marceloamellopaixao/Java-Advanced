package br.com.fiap.exemploAula.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI configurationOpenApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("API de Gerenciamento de Produtos")
                        .description("Projeto de aula sobre Swagger e HateOas")
                        .contact(new Contact()
                                .name("Marcelo Augusto")
                                .email("marceloamellopaixao@gmail.com")
                                .url("https://portmar.firebaseapp.com")
                        )
                        .version("0.0.1")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("url-license.com")
                        )
                );
    }
}
