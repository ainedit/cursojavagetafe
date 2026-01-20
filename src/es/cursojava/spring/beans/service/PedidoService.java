package es.cursojava.spring.beans.service;

import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    public String crearPedido(String cliente) {
        return "Pedido creado para " + cliente;
    }

    public String cancelarPedido(Long id) {
        if (id == null || id < 0) {
            throw new IllegalArgumentException("ID inválido: " + id);
        }
        return "Pedido cancelado: " + id;
    }
}
