package es.cursojava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	private final static Logger log = (Logger)LoggerFactory.getLogger("HolaMundo");
	
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		log.info("HOla");
		System.out.println(num1/num2);
		
		double num11 = 7;
		double num22 = 3;

		System.out.println(num11/num22);
	}

}

