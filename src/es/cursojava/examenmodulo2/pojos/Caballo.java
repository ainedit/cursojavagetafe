package es.cursojava.examenmodulo2.pojos;

import es.cursojava.examenmodulo2.interfaces.Avanzable;
import es.cursojava.examenmodulo2.interfaces.Imprimible;
import es.cursojava.examenmodulo2.interfaces.Participable;

public class Caballo implements Avanzable, Imprimible, Participable	{
	private static int identificador=Participable.IDENTIFICADOR_INICIAL;
	
	private String nombre;
	private double peso;
	private double velocidad;
	private int experiencia;
	private Jinete jinete;
	private double metrosRecorridos;
	
	
	
	public Caballo() {
		super();
	}

	public Caballo(String nombre, double peso, double velocidad, int experiencia) {		super();
		this.nombre = nombre;
		this.peso = peso;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.metrosRecorridos = 0;
	}

	public Caballo(String nombre, double peso, double velocidad, 
			int experiencia, Jinete jinete) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.jinete = jinete;
		this.metrosRecorridos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public Jinete getJinete() {
		return jinete;
	}

	public void setJinete(Jinete jinete) {
		this.jinete = jinete;
	}

	public double getMetrosRecorridos() {
		return metrosRecorridos;
	}

	public void setMetrosRecorridos(double metrosRecorridos) {
		this.metrosRecorridos = metrosRecorridos;
	}
	
	public void resetear() {
		this.metrosRecorridos = 0;
	}
	public void sumarExperiencia(int puntos) {
		this.experiencia+=puntos;
	}

	@Override
	public double calcularAvanceTurno() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void aplicarAvance(double metros) {
		// TODO Auto-generated method stub
		
	}

	
	
	@Override
	public String toString() {
		return "Caballo [nombre=" + nombre + ", peso=" + peso + ", velocidad=" + velocidad + ", experiencia="
				+ experiencia + ", jinete=" + jinete + ", metrosRecorridos=" + metrosRecorridos + "]";
	}

	@Override
	public void imprimeDatos() {
		System.out.println(this);
	}

	@Override
	public String getIdentificador() {
		
		return "Caballo"+(identificador++);
	}
	
	
}
