package com.example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.util.MethodInvocationRecorder.PropertyNameDetectionStrategy;
import org.springframework.web.client.RestTemplate;

import com.example.model.Product;



@SpringBootApplication
//@ComponentScan("com")
//@EntityScan("com.example.model")
//@EnableJpaRepositories("com.example.dao")
public class AjavaprimeApplication {

	/*
	 * @Autowired static Product pds;
	 */
	/*
	 * public static void gojugue() { pds.displayjugue(); }
	 */

@Bean
public RestTemplate getRestTemplate() {
	return new RestTemplate();
}
	public static void main(String[] args) {
		
		SpringApplication.run(AjavaprimeApplication.class, args);
		/*
		 * //SpringApplication.run(AjavaprimeApplication.class, args);
		 * 
		 * ConfigurableApplicationContext
		 * context=SpringApplication.run(AjavaprimeApplication.class, args); String
		 * allBeans[] = context.getBeanDefinitionNames();
		 * 
		 * Arrays.sort(allBeans);
		 * 
		 * //This will display all the beans injected into my application - by default
		 * for(String bean:allBeans) { System.out.println(bean); }
		 */
	
	}

}
