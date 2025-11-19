package es.cursojava.examen.modulo2final.parte1;

public class Master extends CursoImpl {
	private boolean oficial;

	public Master(String nombre, String codigo, int cupo, boolean oficial) {
		super(nombre, codigo, cupo);
		this.oficial = oficial;
	}

	public Master(String nombre, String codigo, int cupo) {
		super(nombre, codigo, cupo);
	}

	public boolean isOficial() {
		return oficial;
	}

	public void setOficial(boolean oficial) {
		this.oficial = oficial;
	}

	@Override
	public String toString() {
		return "Master [oficial=" + oficial + ", nombre=" + getNombreCurso() + ", código()="
				+ getCodigoCurso() + ", cupo=" + getCupoCurso() + "]";
	}


	
	
	
	
	
	
	
	
}
