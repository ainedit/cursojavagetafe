package es.cursojava.enums;

public enum AlumnoEnum {
	
	ALUMNO1("XAlumno1","1234A",9.0),
	ALUMNO2("YAlumno2","1235A",7.0),
	ALUMNO3("ZAlumno3","1236A",5.0),
	ALUMNO4("DAlumno4","1237A",3.0),
	ALUMNO5("FAlumno5","1238A",8.0),
	ALUMNO6("GAlumno6","1239A",10.0);
	
	private String nombre;
	private String dni;
	private double notaMedia;
	
	private AlumnoEnum(String nombre, String dni, double notaMedia) {
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia=notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public double getNotaMedia() {
		return notaMedia;
	}
	
	

}
