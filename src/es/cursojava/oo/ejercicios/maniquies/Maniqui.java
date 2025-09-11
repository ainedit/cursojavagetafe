package es.cursojava.oo.ejercicios.maniquies;

public class Maniqui {
    private int id;
    private Camisa camisa;
    private Pantalon pantalon;
    private Vestido vestido;
    private boolean estaVestido;
    
    public Maniqui(int id) {
        this.id = id;
    }

    public Maniqui(int id, Camisa camisa, Pantalon pantalon) {
        this.id = id;
        this.camisa = camisa;
        this.pantalon = pantalon;
        estaVestido = true;
    }

    public Maniqui(int id, Vestido vestido) {
        this.id = id;
        this.vestido = vestido;
        estaVestido = true;
    }

    public int getId() {
        return id;
    }

    public Camisa getCamisa() {
        return camisa;
    }

    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }

    public Pantalon getPantalon() {
        return pantalon;
    }

    public void setPantalon(Pantalon pantalon) {
        this.pantalon = pantalon;
    }

    public Vestido getVestido() {
        return vestido;
    }

    public void setVestido(Vestido vestido) {
        this.vestido = vestido;
    }
    
    public boolean isEstaVestido() {
		return estaVestido;
	}

	public void desvestir () {
    	this.camisa = null;
    	this.vestido = null;
    	this.pantalon= null;
    	estaVestido = false;
    }

    public void vestir(Pantalon pantalon, Camisa camisa) {
    	desvestir();
    	this.camisa = camisa;
    	this.pantalon = pantalon;
    	estaVestido = true;
    }
    
    public void vestir(Vestido vestido) {
    	desvestir();
    	this.vestido = vestido;
    	estaVestido = true;
    }
}










