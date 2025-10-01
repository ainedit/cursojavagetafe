package es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.vehiculos;

import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Insertable;

public class Bicicleta extends Vehiculo implements Insertable{
    int nunMarchas;

    public Bicicleta(String marca, String modelo, int anio, double velocidadMaxima, String tipo, int nunMarchas) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.nunMarchas = nunMarchas;
    }

    @Override
    public int acelerar() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void select() {
        System.out.println("Consultando la Bici");
    }

    @Override
    public void insert() {
        System.out.println("Insertando Bici");
    }

    

}
