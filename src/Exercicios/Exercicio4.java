package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		 try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(); 
	        scanner.nextLine();  

	        for (int i = 0; i < n; i++) {
	            String line = scanner.nextLine(); 
	            
	            String decipheredLine = decipherLine(line);

	            System.out.println(decipheredLine);
	        }
		}
	    }

	    private static String decipherLine(String line) {
	        int length = line.length();
	        StringBuilder decipheredLine = new StringBuilder(length);

	        for (int i = length / 2 - 1; i >= 0; i--) {
	            decipheredLine.append(line.charAt(i));
	        }

	        for (int i = length - 1; i >= length / 2; i--) {
	            decipheredLine.append(line.charAt(i));
	        }

	        return decipheredLine.toString();

	}

}
