package es.cursojava.interfaces.ejercicios.produtovehiculos;

import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Consultable;
import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Encendible;
import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Insertable;
import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Operable;
import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos.Mechero;
import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos.Ordenador;
import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos.Tarta;
import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.vehiculos.Bicicleta;
import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.vehiculos.Coche;
import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.vehiculos.Vehiculo;
import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.vehiculos.VehiculoMotorizado;
import es.cursojava.interfaces.ejercicios.produtovehiculos.utils.UtilsBBDD;

public class MainProductosVehiculos {

    public static void main(String[] args) {
        MainProductosVehiculos mpv = new MainProductosVehiculos();
        mpv.ejercicio();
    }

    private void ejercicio(){

        Tarta tarta = new Tarta(1,"Tarta1", 20, null, "Chocolate");
        VehiculoMotorizado coche = new Coche("Marca1", "Modelo1", 2020, 200, "Diesel", 5, false);
        Operable ordenador = new Ordenador(1,"O1", 1000, "", null);
        Bicicleta bicicleta = new Bicicleta("","",2020,200,"Pedales",10);
        Mechero mechero = new Mechero(1,"Mechero1", 100, null);

        coche.encender();
        ordenador.encender();

        Encendible [] arrayEncendible = {coche, ordenador,mechero};
        enciende(mechero);
        //operable(coche);
        consulta(coche);
        
        UtilsBBDD.deleteObjeto(coche);
        
    }

    private static void encenderObjetos(Encendible [] arrayEncendible) {
    	for (Encendible encendible : arrayEncendible) {
			encendible.encender();
		}
    }
    
    private void consulta (Consultable consulta){
        consulta.select();
    }

    private void insertObject (Insertable objeto){
        objeto.insert();
    }


    private void operable(Operable objetoOperable){
        objetoOperable.encender();
        objetoOperable.apagar();
        objetoOperable.suspender();

    }


    public void enciende (Encendible objetoEncendible){
        objetoEncendible.encender();
    }

    

}
