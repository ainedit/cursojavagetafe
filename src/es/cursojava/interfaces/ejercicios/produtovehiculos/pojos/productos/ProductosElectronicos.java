package es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos;

import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Apagable;
import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Deletable;
import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Encendible;

public abstract class ProductosElectronicos extends Producto implements Encendible, Apagable , Deletable{

    private String fechaFabricacion;

    public ProductosElectronicos(String nombre, int precio, String fechaFabricacion) {
        super(nombre, precio);
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }


}
