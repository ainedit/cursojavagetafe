package es.cursojava.examenmodulo2.pojos;

public class Apuesta {

	private Apostante apostante;
	private Caballo caballo;
	private double importe;
	
	public Apuesta(Apostante apostante, Caballo caballo, double importe) {
		super();
		this.apostante = apostante;
		this.caballo = caballo;
		this.importe = importe;
	}
	public Apostante getApostante() {
		return apostante;
	}
	public void setApostante(Apostante apostante) {
		this.apostante = apostante;
	}
	public Caballo getCaballo() {
		return caballo;
	}
	public void setCaballo(Caballo caballo) {
		this.caballo = caballo;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	@Override
	public String toString() {
		return "Apuesta [apostante=" + apostante + ", caballo=" + caballo + ", importe=" + importe + "]";
	}

	
}
