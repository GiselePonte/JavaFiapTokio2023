package logicas.aula07;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua nota 1: ");
	    Double nota1 = entrada.nextDouble();

		System.out.println("Digite sua nota 2: ");
	    Double nota2 = entrada.nextDouble();


		System.out.println("Digite sua nota 3: ");
	    Double nota3 = entrada.nextDouble();
	    

		System.out.println("Digite sua nota 4: ");
	    Double nota4 = entrada.nextDouble();
	    
	    
	    media= (nota1+nota2+nota3+nota4)/4;
	    
	    if(media>=7) {
	    	System.out.println("Aprovado!");
	    } else {
	    	if (media >=5) {
	    		System.out.println("Em recuperação");
	    	}else {
	    		System.out.println("Reprovado");
	    	}
	    }
	    
	    
	}

}
