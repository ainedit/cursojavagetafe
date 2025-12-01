package es.cursojava.hibernate.ejercicio1.dto;

public class CursoDTOResp {
	private Long id;
	private String codigo; 
    private String nombre; 
    private String descripcion; 
    private Integer horasTotales; 
    private String mensaje;
    
    
    
	public CursoDTOResp(Long id,  String nombre, String mensaje) {
		super();
		this.id = id;
		this.mensaje = mensaje;
		this.nombre = nombre;
		
	}
	public CursoDTOResp(Long id, String codigo, String nombre, String descripcion, Integer horasTotales,
			String mensaje) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horasTotales = horasTotales;
		this.mensaje = mensaje;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getHorasTotales() {
		return horasTotales;
	}
	public void setHorasTotales(Integer horasTotales) {
		this.horasTotales = horasTotales;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
    
    
}
