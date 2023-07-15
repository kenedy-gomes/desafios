package Exercicios;

 
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);
			System.out.println("Informe um numero");
			
			double n = scanner.nextDouble(); 
			
			int centavos = (int) (n * 100);

			int[] notas = { 10000, 5000, 2000, 1000, 500, 200 };

			int[] moedas = { 100, 50, 25, 10, 5, 1 };

			System.out.println("Notas:");

   
			for (int nota : notas) {
			    int quantidadeNotas = centavos / nota;
			    centavos %= nota;
			    System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, nota / 100.0);
			}

			System.out.println("Moedas:");

			for (int moeda : moedas) {
			    int quantidadeMoedas = centavos / moeda;
			    centavos %= moeda;
			    System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda / 100.0);
			}
		}

	}

}
