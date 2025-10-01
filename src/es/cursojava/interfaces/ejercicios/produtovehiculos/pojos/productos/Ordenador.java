package es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos;

import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Operable;

public final class Ordenador extends ProductosElectronicos implements Operable {

    private String procesador;

    public Ordenador(int id, String nombre, int precio, String fechaFabricacion, String procesador) {
        super(id, nombre, precio, fechaFabricacion);
        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void encender() {
       System.out.println("Encendiendo ordenador");
        
    }

    @Override
    public void apagar() {
        System.out.println("Apagando ordenador");
        
    }

    @Override
    public void suspender() {
        System.out.println("Suspendiendo ordenador");
    }

    @Override
    public void select() {
        System.out.println("Consultando el ordenador "+getNombre() +" con id"+getId());
    }

    @Override
    public void delete() {
        System.out.println("Borrando ordenador");
        
    }

    @Override
    public void insert() {
    	String insert ="INSERT INTO TABLE TB_ORDENADOR (\"procesador\",\"nombre\",\"precio\") "
    			+ "VALUES ("+this.procesador+","+getNombre() +", "+getPrecio()+") )";
        System.out.println("Insertando ordenador");
        
    }

    @Override
    public void update() {
        System.out.println("Actualizando ordenador");
        
    }

    
}
