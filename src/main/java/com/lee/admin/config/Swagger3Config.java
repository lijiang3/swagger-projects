package com.lee.admin.config;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author shuang.kou
 * @description swagger3 相关配置
 */
@Configuration
@EnableOpenApi
public class Swagger3Config {

  @Bean
  public Docket createRestApi() {
    Set<String> produces = new HashSet<>();
    produces.add("application/json");
    return new Docket(DocumentationType.OAS_30)
        .produces(produces)
        .consumes(produces)
        //分组名称
        .groupName("XXX系统API服务")
        .apiInfo(apiInfo())
        .select()
        // 指定controller存放的目录路径
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build()
        // 授权信息设置，必要的header token等认证信息
        .securitySchemes(securitySchemes())
        // 授权信息全局应用
        .securityContexts(securityContexts())
        ;
  }


  /**
   * API 页面上半部分展示信息
   */
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        // 文档标题
        .title("XXX系统API服务")
        // 联系人信息
        .contact(new Contact("zxw", "", ""))
        // 文档描述
        .description("XXX系统API接口文档")
        .version("1.0.0")
        .build();
  }

  /**
   * 设置授权信息
   */
  private List<SecurityScheme> securitySchemes() {
    ApiKey apiKey = new ApiKey("token", "token", "header");
    return Collections.singletonList(apiKey);
  }

  /**
   * 授权信息全局应用
   */
  private List<SecurityContext> securityContexts() {
    return Collections.singletonList(
        SecurityContext.builder()
            .securityReferences(Collections.singletonList(
                new SecurityReference("token",
                    new AuthorizationScope[]{new AuthorizationScope("global", "")}
                )))
            .build()
    );
  }
}