package logicas.aula07;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Digite um número");
		Scanner entrada = new Scanner(System.in);
	    Double valor1 = entrada.nextDouble();
	    
	    
	    System.out.println("Digite um número");
		Scanner entrada1 = new Scanner(System.in);
	    Double valor2 = entrada.nextDouble();
	    
		
		
		if (valor1 == valor2) {
			
			System.out.println("Os valores são iguais");
		} else  {
			if (valor1 < valor2) {
				
				System.out.println(valor1+ "maior que" +valor2);
			
		}else {
			System.out.println(valor2+ "maior que" +valor1);
		}
	}

	}
