package es.cursojava.spring.beans;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
//indica que una clase pertenece a la capa de servicio de la aplicación.
//indica que la clase contiene lógica de negocio y debe ser gestionada por el contenedor IoC de Spring.
public class TicketService {
	private final Ticket provider;

	public TicketService(Ticket provider) {
		this.provider = provider;
	}

	public long newTicketId() {
		return provider.getId(); // nuevo prototype cada vez
	}
}
