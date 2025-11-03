package es.cursojava.examenmodulo2.interfaces;

@FunctionalInterface
public interface Participable {

	int IDENTIFICADOR_INICIAL = 0;
	
	String getIdentificador ();
	
	//método default
	default public void participar() {
		System.out.println("Participando");
	}
}
