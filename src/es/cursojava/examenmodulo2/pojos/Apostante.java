package es.cursojava.examenmodulo2.pojos;

import es.cursojava.examenmodulo2.interfaces.Imprimible;

public class Apostante extends Persona implements Imprimible{

	private double saldo;
	
	public Apostante(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Apostante(String nombre, int edad, double saldo) {
		super(nombre, edad);
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void actualizarSaldo (double importe) {
		this.saldo += importe;
	}

	@Override
	public String toString() {
		return "Apostante [saldo=" + saldo + ", getNombre()=" + getNombre() + "]";
	}

	@Override
	public void imprimeDatos() {
		System.out.println(this);
		
	}
	
	

}
