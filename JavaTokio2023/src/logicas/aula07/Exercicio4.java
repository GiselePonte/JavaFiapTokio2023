package logicas.aula07;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double mult;
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
	    Double a = entrada.nextDouble();
		
		System.out.println("Digite um numero ");
	    Double b = entrada.nextDouble();
	    
	    mult= a*b;
	    
	    if ( mult==0) {
	    	System.out.println("Seu numero é multiplo");
	    }
	    else {
	    	System.out.println("Seu numero não é multiplo");
	    }
		
		
		
	}

}
