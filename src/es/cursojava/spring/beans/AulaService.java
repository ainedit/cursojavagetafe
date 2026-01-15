package es.cursojava.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class AulaService {

  
  //@Autowired(required = true)
  @Autowired
  //@Qualifier("alumnoSpring")
  private AlumnoSpring alumnoPrincipal;

//  @Autowired
//  @Qualifier("alumnoSpringOtro")
//  private AlumnoSpring alumnoSecundario;

  public void mostrarAlumnos() {
    System.out.println("Principal: " + alumnoPrincipal);
    //System.out.println("Secundario: " + alumnoSecundario);
  }
}
