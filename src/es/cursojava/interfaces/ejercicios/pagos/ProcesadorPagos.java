package es.cursojava.interfaces.ejercicios.pagos;

public class ProcesadorPagos {

   public static void realizarPago(Pago metodoPago, double monto){
        metodoPago.procesarPago(monto);
   }
   
}
