package es.cursojava.interfaces.ejercicios.pagos;

public class PagoCriptomonedas implements Pago{
	private String criptomoneda;
	
	public PagoCriptomonedas(String criptomoneda) {
		super();
		this.criptomoneda = criptomoneda;
	}

	@Override
    public void procesarPago(double monto) {
		if(criptomoneda.equals("Bitcoin")) {
			monto = monto* 0.00003;
		}
			
        System.out.println("Realizando pago de "+monto+"bitcoins con criptomonedas");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Pago Realizado correctamente");
    }

	public String getCriptomoneda() {
		return criptomoneda;
	}

	public void setCriptomoneda(String criptomoneda) {
		this.criptomoneda = criptomoneda;
	}
	
	

}
