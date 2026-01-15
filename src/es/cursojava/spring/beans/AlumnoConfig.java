package es.cursojava.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlumnoConfig {

  @Bean(name = "alumnoSpring")
  public AlumnoSpring alumno() {
    return new AlumnoSpring("Ana", "García", 8.5);
  }
  
  @Bean(name = "alumnoSpringOtro")
  public AlumnoSpring alumnoOtro() {
	return new AlumnoSpring("Luis", "Martínez", 7.2);
  }
}