package es.cursojava.spring.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Ticket {
	private long id = System.nanoTime();

	public long getId() {
		return id;
	}
}