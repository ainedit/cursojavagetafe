package es.cursojava.hibernate.ejercicio1.dto;

public class AlumnoDTO  {
	private Long id;
	private String nombre;
	private String email;
	private int edad;
	private int codigo_curso;
	
	public AlumnoDTO() {}
	
	public AlumnoDTO(String nombre, String email, int edad, int codigo_curso) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.codigo_curso = codigo_curso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCodigo_curso() {
		return codigo_curso;
	}

	public void setCodigo_curso(int codigo_curso) {
		this.codigo_curso = codigo_curso;
	}

}
