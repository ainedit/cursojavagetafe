package es.cursojava.oo;

public class Asignatura {
	private String nombre;
	private int curso;
	
	public Asignatura() {
		
	}
	
	public Asignatura(String nombre, int curso) {
		super();
		this.nombre = nombre;
		this.curso = curso;
	}
	
//	public String getNombre() {
//		return nombre;
//	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
//	public int getCurso() {
//		return curso;
//	}
//	public void setCurso(int curso) {
//		this.curso = curso;
//	}

}
