package logica.aulas.aula06;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double valorTotal;
		
		System.out.println("Digite o nome da peça: ");
		Scanner entrada = new Scanner(System.in);
		String peça1 = entrada.nextLine();
	
		
		System.out.println("Quantas " +peça1+ " voce irá querer?");
		double quant = Double.parseDouble (entrada.nextLine());
		
	System.out.println("Qual o valor unitário de cada "+peça1);
	double preço1 = Double.parseDouble (entrada.nextLine());

	
	
	
	
	
	
	System.out.println("Digite o nome da peça2:");
	String peça2 = entrada.nextLine();
	
	
	System.out.println("Quantas" +peça2+ "voce irá querer?");
	int quant2 = Integer.parseInt(entrada.nextLine());
	
	System.out.println("Qual o valor unitário da cada"+peça2);
	double preço2 = Double.parseDouble(entrada.nextLine());
	

	valorTotal = (quant* preço1 + quant2* preço2);
	
	System.out.println("O valor total a ser pago será:  " +valorTotal);
	}

}
