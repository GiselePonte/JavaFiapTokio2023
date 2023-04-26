package logica.aulasFor;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner (System.in);
		
       
       int gisa= 0;
       

		for (int i = 0; i <=12; i++) {
			
			System.out.println("Digite um numero: ");
			int valor = sc.nextInt();
		
			
			if (valor > gisa) {
				
				valor = gisa;
			}
				
			
		}
		
		System.out.println(" O maior valor :" +gisa );
		
			
			
			
			
			
			
			
			
			
	
		
		
		
	}

}
