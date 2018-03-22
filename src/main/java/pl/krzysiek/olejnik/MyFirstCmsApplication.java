package pl.krzysiek.olejnik;

import javax.validation.Validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import pl.krzysiek.olejnik.cms.converter.ArticlesConverter;
import pl.krzysiek.olejnik.cms.converter.AuthorsConverter;
import pl.krzysiek.olejnik.cms.converter.CategoriesConverter;

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
