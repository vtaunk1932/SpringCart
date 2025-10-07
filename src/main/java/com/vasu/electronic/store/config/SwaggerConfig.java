package com.vasu.electronic.store.config;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration



@SecurityScheme(
        name = "scheme1",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
@OpenAPIDefinition(

        info = @Info(
                title = "Electronic Store API ",
                description = "This is backed of electronic store developed in premium course",
                version = "1.0V",
                contact = @Contact(
                        name = "Vasu Taunk",
                        email = "vasutaunk1932@gmail.com",
                        url = "https://www.instagram.com/vasu_taunk/"
                ),
                license = @License(
                        name = "OPEN License",
                        url = "https://www.instagram.com/vasu_taunk/"
                )
        )
        ,
        externalDocs = @ExternalDocumentation(
                description = "This is external docs",
                url = "https://www.instagram.com/vasu_taunk/"
        )
)
public class SwaggerConfig {
//
//    @Bean
//    public OpenAPI openAPI() {
//
//        String schemeName = "bearerScheme";
//
//        return new OpenAPI()
//                .addSecurityItem(new SecurityRequirement()
//                        .addList(schemeName)
//                )
//                .components(new Components()
//                        .addSecuritySchemes(schemeName, new SecurityScheme()
//                                .name(schemeName)
//                                .type(SecurityScheme.Type.HTTP)
//                                .bearerFormat("JWT")
//                                .scheme("bearer")
//                        )
//                )
//                .info(new Info()
//                        .title("Electronic Store API")
//                        .description("This is electronic store project api developed by LCWD")
//                        .version("1.0")
//                        .contact(new Contact().name("Durgesh").email("durgesh@gmail.com").url("durgesh.com"))
//                        .license(new License().name("Apache"))
//
//                ).externalDocs(new ExternalDocumentation().url("learncodewithdurgesh.com").description("this is external url"))
//
//                ;
//
//    }
//
//    @Bean
//    public Docket docket() {
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//        docket.apiInfo(getApiInfo());
//        docket.securityContexts(Arrays.asList(getSecurityContext()));
//        docket.securitySchemes(Arrays.asList(getSchemes()));
//        ApiSelectorBuilder select = docket.select();
//        select.apis(RequestHandlerSelectors.any());
//        select.paths(PathSelectors.any());
//        Docket build = select.build();
//        return build;
//    }
//
//
//    private SecurityContext getSecurityContext() {
//
//        SecurityContext context = SecurityContext
//                .builder()
//                .securityReferences(getSecurityReferences())
//                .build();
//        return context;
//    }
//
//    private List<SecurityReference> getSecurityReferences() {
//        AuthorizationScope[] scopes = {new AuthorizationScope("Global", "Access Every Thing")};
//        return Arrays.asList(new SecurityReference("JWT", scopes));
//
//    }
//
//    private ApiKey getSchemes() {
//        return new ApiKey("JWT", "Authorization", "header");
//    }
//
//
//    private ApiInfo getApiInfo() {
//
//        ApiInfo apiInfo = new ApiInfo(
//                "Electronic Store Backend : APIS ",
//                "This is backend project created by LCWD",
//                "1.0.0V",
//                "https://www.learncodewithdurgesh.com",
//                new Contact("Durgesh", "https://www.instagram.com/durgesh_k_t", "learncodewithdurgesh@gmail.com"),
//                "License of APIS",
//                "https://www.learncodewithdurgesh.com/about",
//                new ArrayDeque<>()
//        );
//
//        return apiInfo;
//
//    }
//

}
