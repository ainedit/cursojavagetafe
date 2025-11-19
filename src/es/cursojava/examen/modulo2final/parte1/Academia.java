package es.cursojava.examen.modulo2final.parte1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.cursojava.utils.Utilidades;

public class Academia {

	public static void main(String[] args) {
		try {
			Master master1 = new Master("Master1","M-1",5, true);
			Master master2 = new Master("Master2","M-2",10);
			Master master3 = new Master("Master3","M-3",15, true);
	
			List<Master> masters = new ArrayList<Master>();
			masters.add(master3);
			masters.add(master2);
			masters.add(master1);
		
			String codMaster = Utilidades.pideDatoCadena("Introduce código del máster a eliminar");
			
			Iterator<Master> ite =  masters.iterator();
			while (ite.hasNext()) {
				Master master = ite.next();
				if (codMaster.equalsIgnoreCase(master.getCodigoCurso())) {
					System.out.println("Eliminando Master "+master.getNombreCurso() + " ...");
					ite.remove();
					System.out.println("Master "+master.getNombreCurso() + " eliminado");
				}
			}
			
			System.out.println("Masters oficiales");
			for (Master master : masters) {
				if (master.isOficial()) {
					System.out.println(master);
				}
			}
			
		}catch(Exception e) {
			System.out.println("Error descontrolado " + e.getMessage());
		}
	}

}

