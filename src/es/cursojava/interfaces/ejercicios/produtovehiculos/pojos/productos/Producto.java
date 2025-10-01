package es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos;

import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Consultable;

public abstract class Producto implements Consultable{

    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}