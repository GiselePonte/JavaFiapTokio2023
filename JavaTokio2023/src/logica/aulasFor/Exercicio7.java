package logica.aulasFor;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner (System.in);
		int a=0;
		int b=0;
		
		System.out.println("Digite a media");
		Double media = sc.nextDouble();
		
		
		
		for (int i=0; i<20; i++) {
			i++;
			
		System.out.println("Digite a nota dos alunos: ");
		Double nota = sc.nextDouble();
		
		if (nota<media) {
			
			System.out.println("nota maior que a media");
		} else {
			System.out.println("nota menor que a media");
		}
			
		
		
		System.out.println(nota+ "nota maior que a media");
		System.out.println(media+ "nota maior que a media");
		}
		}
			
		
		
		

	}


