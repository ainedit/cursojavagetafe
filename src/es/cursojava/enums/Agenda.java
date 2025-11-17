package es.cursojava.enums;

import java.util.Iterator;

import es.cursojava.utils.Utilidades;

public class Agenda {

	public static void main(String[] args) {
		
		DiasSemana [] programacionSemanal = {DiasSemana.SABADO, DiasSemana.DOMINGO}; 
		
		System.out.println(DiasSemana.values().length);
		System.out.println();
		
		DiasSemana [] diasTotales = DiasSemana.values();
		System.out.println("Todos los días disponibles ");
		for(DiasSemana diaSemana : diasTotales) {
			System.out.println(diaSemana);
		}
		
		System.out.println("Tarea: ");
		for (DiasSemana diaSemanaTarea : programacionSemanal) {
			System.out.println(diaSemanaTarea);
		}
		
		Tarea tarea1 = new Tarea("Comprar pan", programacionSemanal);
		recordarTarea (tarea1);

	}
	
	private static void recordarTarea (Tarea tarea) {
		String diaSemana = Utilidades.pideDatoCadena("Introduce día de la semana");
		DiasSemana [] diasTarea1 = tarea.getVistaSemana();
		for (DiasSemana diaTarea : diasTarea1) {
			if (diaTarea.name().equalsIgnoreCase(diaSemana)) {
				System.out.println("Ejecuta la tarea "+ tarea.getNombreTarea());
			}
		}
		
		
	}

}
