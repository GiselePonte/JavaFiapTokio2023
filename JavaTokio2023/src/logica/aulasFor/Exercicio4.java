package logica.aulasFor;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int soma =0;
		
		for (int i = 0; i <=10; i++) {
			
			System.out.println(" Digite um numero: ");
			 int valor = sc.nextInt();
		
			soma= valor +soma;
			 
		
			 
		}

		 System.out.println("Os numeros somados são " +soma);
	}

}
