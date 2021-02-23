package com.lee.admin.config;

import java.util.HashSet;
import java.util.Set;
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
 * @author shuang.kou
 * @description swagger 相关配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket createRestApi() {
    Set<String> produces = new HashSet<>();
    produces.add("application/json");
    return new Docket(DocumentationType.SWAGGER_2)
        .produces(produces)
        .consumes(produces)
        //分组名称
        .groupName("XXX系统API服务")
        .apiInfo(apiInfo())
        .select()
        // 指定controller存放的目录路径
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build();
  }


  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        // 文档标题
        .title("XXX系统API服务")
        // 联系人信息
        .contact(new Contact("zxw","",""))
        // 文档描述
        .description("XXX系统API接口文档")
        .version("1.0.0")
        .build();
  }
}