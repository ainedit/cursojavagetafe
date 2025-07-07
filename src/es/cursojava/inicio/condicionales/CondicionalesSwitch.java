package es.cursojava.inicio.condicionales;

public class CondicionalesSwitch {

	public static void main(String[] args) {
		
		String mes = "mayo";
		switch (mes) {
			case "enero","febrero" , "marzo"  -> {
				//Si queremos introducir varios comandos debemos añadir llaves
				System.out.println("Invierno");
				System.out.println("Invierno"); 
			}
			case "abril","mayo" , "junio"  -> System.out.println("Primavera");
			case "julio","agosto" , "septiembre"  -> System.out.println("Verano");
			case "octubre","noviembre" , "diciembre"  -> System.out.println("Otoño");
			default -> System.out.println("Incorrecto");
		}
		
		
		switch (mes) {
			case "enero" : 
			case "febrero" : 
			case "marzo" : System.out.println("Invierno");break;
			case "abril" : 
			case "mayo" : 
			case "junio" : System.out.println("Primavera");break;
			case "julio" : 
			case "agosto" : 
			case "septiembre" : System.out.println("Verano");break;
			case "octubre" : 
			case "noviembre" : 
			case "diciembre" : System.out.println("Otoño");break;
			default : System.out.println("Mes incorrecto");
		
		}
		
		String letra = "a"; 
		
		switch (letra) {
    		case "a", "e", "i", "o", "u" -> System.out.println("Vocal");
    		default -> System.out.println("Consonante");
		};
		
		
		int dia = 3;
		switch (dia) {
		    case 1 -> System.out.println("Lunes");
		    case 2 -> System.out.println("Martes");
		    case 3 -> System.out.println("Miércoles");
		    case 4 -> System.out.println("Jueves");
		    case 5 -> System.out.println("Viernes");
		    case 6 -> System.out.println("Sábado");
		    case 7 -> System.out.println("Domingo");
		    default -> System.out.println("Día inválido");
		};
		
		
		String tipo = switch (letra) {
	    	case "a", "e", "i", "o", "u" -> "Vocal";
	    	default -> "Consonante";
		};
		System.out.println(tipo);
		
		
		
		
		
		System.out.println("Termina");

	}

}
