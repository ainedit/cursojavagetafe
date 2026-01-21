package es.cursojava.spring.aop;

public class SecurityException extends Exception {

	private static final long serialVersionUID = 1L;

	public SecurityException(){
		super("Violaci�n de la seguridad");
	}
	
	public SecurityException(String message){
		super(message);
	}
}
