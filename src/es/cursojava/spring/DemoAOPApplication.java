package es.cursojava.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.cursojava.spring.beans.service.PedidoService;


public class DemoAOPApplication {

	public static void main(String[] args) {

        try (AnnotationConfigApplicationContext ctx =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            PedidoService pedidoService = ctx.getBean(PedidoService.class);

            System.out.println("---- CASO OK ----");
            pedidoService.crearPedido("Ana");

            System.out.println("\n---- CASO EXCEPCIÓN ----");
            try {
                pedidoService.cancelarPedido(-1L);
            } catch (Exception ignored) {}
        }
    }
}