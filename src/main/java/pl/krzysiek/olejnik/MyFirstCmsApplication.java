package pl.krzysiek.olejnik;

import javax.validation.Validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@ComponentScan("pl.krzysiek.olejnik")
@SpringBootApplication
public class MyFirstCmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstCmsApplication.class, args);
	}
	
	@Bean
	public Validator validator() {
	    return new LocalValidatorFactoryBean();
	}
	
}
