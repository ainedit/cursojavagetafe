package es.cursojava.hibernate.ejercicio2.exception;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
