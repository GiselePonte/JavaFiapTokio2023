package logica.aulas.aula06;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double media;
		
		
		
		System.out.println("Digite sua nota 1: ");
		Scanner entrada = new Scanner(System.in);
		double valor1 = entrada.nextDouble();
		
		System.out.println("Digite sua nota 1: ");
		Scanner entrada1 = new Scanner(System.in);
		double valor2 = entrada.nextDouble();
		
		media= (valor1 *4 + valor2*6);
		
		
		System.out.println("Sua media poderada é: " +media);
		
		
		
		

	}

}
