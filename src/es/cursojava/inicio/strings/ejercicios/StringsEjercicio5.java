package es.cursojava.inicio.strings.ejercicios;

public class StringsEjercicio5 {

	public static void main(String[] args) {
		String email = "  email.correo@asdas.es     ";
		String mensajeError = "";
		
		email = email.trim();
		
		if (email.isEmpty()) {
			mensajeError = "El email no puede estar en blanco";
		}else {
			if (email.contains(" ")) {
				mensajeError = "El email no puede tener espacios en blanco\n";
			}
			
			if (!email.contains("@")) {
				mensajeError += "El email no tiene arroba\n";
			}
			else if (email.indexOf("@")!=email.lastIndexOf("@")) {
				mensajeError += "El email no puede tener más de 1 arroba\n";
			}else {
				String dominio = email.substring(email.indexOf("@")+1);
				System.out.println("dominio: "+dominio);
				
				if (!dominio.contains(".")) {
					mensajeError += "El dominio del email debe contener al menos un punto \n";
				}else {//Si contiene punto
					int posicionPunto = dominio.indexOf(".");
					if (posicionPunto <2 ) {
						mensajeError += "La separación entre la @ y el primer punto debe ser superior a 2 caracteres \n";
					}
					
					int posicionUltimoPunto = dominio.lastIndexOf(".");
					int longitudDominio = dominio.length()-1;
					if (longitudDominio - posicionUltimoPunto<2 ||
							longitudDominio - posicionUltimoPunto>6) {
						mensajeError += "Después del último punto solo puede haber entre 2 y 6 caracteres \n";
					}
				}
				
				
			}
		
		}
		
		
		
		
		
		if (mensajeError.isEmpty()) {
			System.out.println("El email "+ email +" es valido");
		}else {
			System.out.println(mensajeError);
		}

	}

}
