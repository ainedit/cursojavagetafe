package es.cursojava.enums;

public class Tarea {
	private String nombreTarea;
	private DiasSemana[] vistaSemana;
	
	public Tarea(String nombreTarea, DiasSemana[] vistaSemana) {
		super();
		this.nombreTarea = nombreTarea;
		this.vistaSemana = vistaSemana;
	}
	public String getNombreTarea() {
		return nombreTarea;
	}
	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}
	public DiasSemana[] getVistaSemana() {
		return vistaSemana;
	}
	public void setVistaSemana(DiasSemana[] vistaSemana) {
		this.vistaSemana = vistaSemana;
	}
	
	
	
}
