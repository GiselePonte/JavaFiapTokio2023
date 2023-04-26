package logica.aulasFor;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		
		int resul=0;
		

		System.out.println("Digite um valor: ");
		int n = sc.nextInt();
		
		for (int i=0; i<2; i++) {
			
			 
			resul= n;
			
			if (n++ ==0) {
				
				System.out.println(" Numeros pares"  +n);
			}
			
			
		}
		

	}

}
