package es.cursojava.hibernate.ejercicio1.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CursoDTOReq {

    private String codigo; // obligatorio, único, max 20
    private String nombre; // obligatorio, no vacío, max 100
    private String descripcion; // opcional, max 1000
    private Integer horasTotales; // obligatorio, entero positivo (>0)
    private Boolean activo = Boolean.TRUE; // obligatorio, por defecto true
    private String nivel; // opcional, max 20
    private String categoria; // opcional, max 50
    private BigDecimal precio; // opcional, >= 0
    private LocalDate fechaInicio; // opcional
    private LocalDate fechaFin; // opcional, si existe >= fechaInicio
    private LocalDateTime fechaCreacion; // obligatorio, set en PrePersist
    
	public CursoDTOReq(String codigo, String nombre, Integer horasTotales, LocalDateTime fechaCreacion, boolean activo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTotales = horasTotales;
		this.fechaCreacion = fechaCreacion;
		this.activo = activo;
	}

	public CursoDTOReq(String codigo, String nombre, String descripcion, Integer horasTotales, Boolean activo,
			String nivel, String categoria, BigDecimal precio, LocalDate fechaInicio, LocalDate fechaFin,
			LocalDateTime fechaCreacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horasTotales = horasTotales;
		this.activo = activo;
		this.nivel = nivel;
		this.categoria = categoria;
		this.precio = precio;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.fechaCreacion = fechaCreacion;
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

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
}
