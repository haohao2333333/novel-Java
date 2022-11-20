package com.haohao.novel.config;

import io.swagger.annotations.Api;
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

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo()).select()
                //接口所在的包
                .apis(RequestHandlerSelectors.basePackage("com.haohao.novel.controller"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo getApiInfo() {
        // 定义联系人信息
        Contact contact = new Contact("haohao2333333", "https://github.com/haohao2333333", "1917390625@qq.com");
        return new ApiInfoBuilder()
                .title("API 接口文档") // 标题
                .description("API 接口文档 服务") // 描述信息
                .version("1.0.0") // //版本
                .contact(contact)
                .build();
    }

}