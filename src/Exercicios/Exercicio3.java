package Exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Informe um numero");
			int n = scanner.nextInt();  
			System.out.println("Informe um array de numero");
			int k = scanner.nextInt();  
			scanner.nextLine();
			
			int[] arr = new int[n];  

			int count = countPairsWithDifferenceK(arr, k);

			System.out.println(count);
		}
    }

    private static int countPairsWithDifferenceK(int[] arr, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

     
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

       
        for (int num : arr) {
            int complement = num - k;
            count += frequencyMap.getOrDefault(complement, 0);
        }

        return count;

	}

}
