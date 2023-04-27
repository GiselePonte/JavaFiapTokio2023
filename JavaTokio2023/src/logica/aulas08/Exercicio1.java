package logica.aulas08;
import java.util.Calendar;
import java.util.Scanner;

public class Exercicio1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
System.out.println("Digite seu nome: ");
String nome= sc.nextLine();


		Calendar c = Calendar.getInstance();
		int hora = c.get(Calendar.HOUR_OF_DAY);
		
		
		
		if (hora <= 6) {
			System.out.println("Bom dia, "+nome+ "!" +hora );
		}
			if (hora >=12) {
				
			System.out.println("Boa tarde, " +nome+ "!" +hora);
		} else if (hora >=18) {
			System.out.println("Boa noite, " +nome+ "! Agora sao: " +hora+ "horas"); 
		}
		
	}

}
