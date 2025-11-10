package es.cursojava.excepciones.ejercicios.ejercicio2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClienteAsiduo extends ClienteCafetero {
	private String mote;

	
	public ClienteAsiduo(String nombre, String mote) {
		super(nombre);
		this.mote = mote;
	}
	
	
}
