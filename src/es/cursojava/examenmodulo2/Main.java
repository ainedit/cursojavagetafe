package es.cursojava.examenmodulo2;

import es.cursojava.examenmodulo2.pojos.GranPremio;

public class Main {

	public static void main(String[] args) {

		GranPremio granPremio = new GranPremio("Yegua Prix Getafe");
		granPremio.init();
		granPremio.empezarGranPremio();
	}

}
