package com.mercbenz.datalogging.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfiguration  extends WebMvcConfigurerAdapter{

	@Value("${app.controller.base.package}")
	String appBaseControllerPackage;
	
	@Bean
	public Docket api() {                
	    return new Docket(DocumentationType.SWAGGER_2)          
	      .select()   
	      .apis(RequestHandlerSelectors.basePackage(appBaseControllerPackage))				
		  .apis(RequestHandlerSelectors.any())
		   .paths(PathSelectors.any())
		  .build()	       
          .pathMapping("/")
          .apiInfo(apiEndPointsInfo()); 
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// enabling swagger-ui part for visual documentation
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
	
	 private ApiInfo apiEndPointsInfo() {
			return new ApiInfoBuilder().title("Spring Boot REST API")
			    .description("CommonDataService REST API")        
			    .license("Apache 2.0")
			    .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
			    .version("1.0.0")
			    .build();
		    }
}
