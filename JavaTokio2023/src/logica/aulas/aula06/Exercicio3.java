package logica.aulas.aula06;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nome;
	
	
		System.out.println("Escreva seu nome; ");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a letra do seu gênero:  [M] masculino/n [F] feminino/n [O] outro; [N] não responder/n ");
		
		char letra =entrada.nextLine().charAt (0);
		
		System.out.println("Olá"+ nome ,"Voce escolheu a seguinte opção de genero:" + letra);	
		
	}

}
