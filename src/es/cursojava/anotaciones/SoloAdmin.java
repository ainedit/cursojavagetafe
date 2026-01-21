package es.cursojava.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
 * RetentionPolicy.SOURCE://Compilación
 * 	+ Solo existe en el código fuente.
	+ No llega al .class.
	+ Usada solo por el compilador.

   RetentionPolicy.CLASS// @Deprecated
	+ Se guarda en el bytecode (.class).
	+ No disponible en ejecución.
	+ Usada por herramientas externas.

	RetentionPolicy.RUNTIME
	+ Disponible en tiempo de ejecución.
	+ Puede leerse con reflexión.
	+ Usada por frameworks (Spring, Hibernate).
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SoloAdmin {

}
