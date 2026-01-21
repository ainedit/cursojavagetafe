package es.cursojava.spring.aop;

public class SecurityException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SecurityException(){
		super("Violación de la seguridad");
	}
	
	public SecurityException(String message){
		super(message);
	}
}
