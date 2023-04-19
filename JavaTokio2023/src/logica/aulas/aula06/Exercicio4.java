package logica.aulas.aula06;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		 double result;
		 
		 
		 System.out.println("Digite sua nota 1: ");
		 Scanner entrada = new Scanner(System.in);
		 Double nota1 = entrada.nextDouble();
		 
		 System.out.println("Digite sua nota 2: ");
		 Scanner entrada1 = new Scanner(System.in);
		 Double nota2 = entrada1.nextDouble();
		 
		 result=(nota1+nota2) /2 ;
		 
		 System.out.println("Sua média é:  " + result);
		 
		 
			
	}

}
