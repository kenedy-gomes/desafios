package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Informe um numero inteiro positivo");
			int n = scanner.nextInt(); 
			List<Integer> pares = new ArrayList<>();
			List<Integer> impares = new ArrayList<>();

   
			for (int i = 0; i < n; i++) {
				System.out.println("Informe um numero inteiro não negativo");
			    int valor = scanner.nextInt();
			    if (valor % 2 == 0) {
			        pares.add(valor);
			    } else {
			        impares.add(valor);
			    }
			}

			Collections.sort(pares);  
			
			Collections.sort(impares, Collections.reverseOrder());

			  for (int par : pares) {
		            System.out.println("Par: " + par);
		        }

		      for (int impar : impares) {
		            System.out.println("Impar: " + impar);
		      }
		}

	}

}
