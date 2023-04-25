package logica.aulasFor;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r =0;
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite um numero: ");
		 int valor = sc.nextInt();
		
		
		for (int i = 0; i <=25; i++) {
		r= i*valor;
			
			
			System.out.println(i+"x"+valor+"="+ r);
			}
		
	}

}
