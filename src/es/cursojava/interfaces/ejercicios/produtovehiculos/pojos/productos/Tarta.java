package es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos;

public final class Tarta extends Alimentos {

    private String sabor;

    public Tarta(int id, String nombre, int precio, String fechaCaducidad, String sabor) {
        super(id, nombre, precio, fechaCaducidad);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public void select() {
        System.out.println("Consultando la Tarta");
    }

    @Override
    public void insert() {
        System.out.println("Insertando Tarta");
    }

    
    
}
