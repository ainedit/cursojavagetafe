package es.cursojava.oo.herencia.ejercicios.hospital;

public class HospitalMain {

	public static void main(String[] args) {
		Hospital hospital = Hospital.abrirHospital();
		//System.out.println(hospital.getSalaDeEspera()[2].getSintomas()[2]);
		
		
		//hospital.horaDeComer(hospital.getSalaDeEspera());
//		hospital.ficharEmpleados();
//		hospital.horaDeComer();
		hospital.pasarConsultas();
//		hospital.horaDeComer();

	}
}
