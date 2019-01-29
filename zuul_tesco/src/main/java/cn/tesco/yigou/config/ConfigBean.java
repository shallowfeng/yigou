package cn.tesco.yigou.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 2019/1/27
 */
@SpringBootConfiguration
@EnableSwagger2
public class ConfigBean {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("易购分布式购物系统")
                .description("易购系统接口文档说明")
                .termsOfServiceUrl("http://localhost:8001")
                .contact(new Contact("shallow", "", "lishugeng@itsoruce.cn"))
                .version("1.0")
                .build();
    }
}
