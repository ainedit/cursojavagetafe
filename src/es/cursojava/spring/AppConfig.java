package es.cursojava.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "es.cursojava.spring.beans")
//recomendado usar basePackages en lugar de value y no usar {}
//ya que solo se indica un paquete y sus subpaquetes
/*@ComponentScan({
	  "com.demo.service",
	  "com.demo.repo",
	  "com.demo.web"
	})*/
public class AppConfig {

}
