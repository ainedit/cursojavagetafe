package es.cursojava.interfaces.ejercicios.pagos;

public class PagoPaypal implements Pago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Realizando pago de "+monto+"€ con Paypal");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Pago Realizado correctamente");
    }

}
