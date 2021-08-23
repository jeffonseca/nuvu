package cc.nuvu.client.config;

import cc.nuvu.client.Constant;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger {

    @Value("${application-version}")
    String appVersion;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title(Constant.SWAGGER_TITLE)
                    .version(appVersion)
                    .description(Constant.SWAGGER_DESCRIPTION)
                    .termsOfService(Constant.SWAGGER_TERM_OF_USE)
                        .contact(
                                new Contact()
                                        .name(Constant.SWAGGER_CONTACT_NAME)
                                        .email(Constant.SWAGGER_CONTACT_EMAIL)
                        )
                    .license(new License()
                            .name(Constant.SWAGGER_LICENSE_NAME)
                            .url(Constant.SWAGGER_LICENSE_URL)
                    )
                );
    }
}
