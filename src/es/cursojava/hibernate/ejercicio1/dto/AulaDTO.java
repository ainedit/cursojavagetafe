package es.cursojava.hibernate.ejercicio1.dto;

public class AulaDTO {

    private Long id;
    private String codigoAula;
    private Integer capacidad;
    private String ubicacion;

    public AulaDTO() {
    }

    public AulaDTO(Long id, String codigoAula, Integer capacidad, String ubicacion) {
        this.id = id;
        this.codigoAula = codigoAula;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
    }

    public AulaDTO(String codigoAula, Integer capacidad, String ubicacion) {
        this.codigoAula = codigoAula;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
    }

    public Long getId() {
        return id;
    }

    public String getCodigoAula() {
        return codigoAula;
    }

    public void setCodigoAula(String codigoAula) {
        this.codigoAula = codigoAula;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
