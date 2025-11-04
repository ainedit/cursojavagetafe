package es.cursojava.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString 
@Builder
public class Botella {
	
	private double capacidad;
	private String material;
	private String forma;
	@Exclude
	private String contenido;
	
	
}
