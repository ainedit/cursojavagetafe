package es.cursojava.hibernate.ejercicio1.entites;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.AssertTrue;

@Entity
@Table(name = "TB_CURSO")
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // obligatorio, PK, autoincremental

    @NotNull
    @NotBlank
    @Size(max = 20)
    @Column(name = "codigo", nullable = false, unique = true, length = 20)
    private String codigo; // obligatorio, único, max 20

    @NotNull
    @NotBlank
    @Size(max = 100)
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre; // obligatorio, no vacío, max 100

    @Size(max = 1000)
    @Column(name = "descripcion", length = 1000)
    private String descripcion; // opcional, max 1000

    @NotNull
    @Min(1)
    @Column(name = "horas_totales", nullable = false)
    private Integer horasTotales; // obligatorio, entero positivo (>0)

    @NotNull
    @Column(name = "activo", nullable = false)
    private Boolean activo = Boolean.TRUE; // obligatorio, por defecto true

    @Size(max = 20)
    @Column(name = "nivel", length = 20)
    private String nivel; // opcional, max 20

    @Size(max = 50)
    @Column(name = "categoria", length = 50)
    private String categoria; // opcional, max 50

    @PositiveOrZero
    @Column(name = "precio")
    private BigDecimal precio; // opcional, >= 0

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio; // opcional

    @Column(name = "fecha_fin")
    private LocalDate fechaFin; // opcional, si existe >= fechaInicio

    @NotNull
    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion; // obligatorio, set en PrePersist

    // Constructors
    public Curso() {
        // JPA
    }

    public Curso(String codigo, String nombre, Integer horasTotales) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasTotales = horasTotales;
        this.activo = Boolean.TRUE;
    }

    // Getters and setters
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

    // Validation for date consistency: fechaFin must be null or >= fechaInicio
    @AssertTrue(message = "fechaFin debe ser igual o posterior a fechaInicio")
    private boolean isFechaFinValida() {
        if (fechaFin == null) {
            return true;
        }
        if (fechaInicio == null) {
            return true; // if inicio not set, we allow fechaFin
        }
        return !fechaFin.isBefore(fechaInicio);
    }

    @PrePersist
    private void prePersist() {
        if (fechaCreacion == null) {
            fechaCreacion = LocalDateTime.now();
        }
        if (activo == null) {
            activo = Boolean.TRUE;
        }
    }

    // equals/hashCode based on id when present, otherwise codigo
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (id != null && other.id != null) {
            return id.equals(other.id);
        }
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", horasTotales=" + horasTotales
                + ", activo=" + activo + ", nivel=" + nivel + ", categoria=" + categoria + ", precio=" + precio
                + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", fechaCreacion=" + fechaCreacion
                + "]";
    }
}