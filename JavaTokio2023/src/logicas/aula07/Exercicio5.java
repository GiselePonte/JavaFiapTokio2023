package logicas.aula07;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double resultado;	
		String status;
		int escolhaUsuario= 1;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("--------------------");
		System.out.println("CODIGO CALCULADORA");
		System.out.println("--------------------");
		
		
		System.out.println("digite um numero ");
		   double n1 = Double.parseDouble (entrada.nextLine());
		   
		   System.out.println("digite um numero ");
		   double n2 = Double.parseDouble (entrada.nextLine());
		   
		   
		   System.out.println("Escolha uma opção ");
		   System.out.println("+");
		   System.out.println("-");
		   System.out.println("*");
		   System.out.println("/");
		
		switch (escolhaUsuario ) {
		
		case 0:
			status = "+";
			resultado= n1+n2;
			System.out.println("Resultado" +resultado);
		break;
		
			
		case 1:
		status = "-";
		resultado = n1-n2;
		System.out.println("Resultado" +resultado);
		break;
		
		case 2:
			status = "*";
			resultado = n1*n2;
			System.out.println("Resultado" +resultado);
			break; 
			
		case 3:
			status = "/";
			resultado = n1/n2;
			System.out.println("Resultado" +resultado);
			break;
			
			default:
				status = "erro";
	
		}
		

	}

}
