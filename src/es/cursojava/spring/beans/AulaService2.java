package es.cursojava.spring.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AulaService2 {

  private final AlumnoSpring alumno1;
  private final AlumnoSpring alumno2;

  public AulaService2(
      @Qualifier("alumnoSpring") AlumnoSpring alumno1,
      @Qualifier("alumnoSpringOtro") AlumnoSpring alumno2) {
    this.alumno1 = alumno1;
    this.alumno2 = alumno2;
  }

  public void mostrarAlumnos() {
    System.out.println(alumno1);
    System.out.println(alumno2);
  }
}
