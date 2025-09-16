package es.cursojava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	private final static Logger log = LoggerFactory.getLogger(Test.class);
	
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		log.warn("Hola");
		System.out.println(num1/num2);
		
		double num11 = 7;
		double num22 = 3;

		System.out.println(num11/num22);
	}

}

