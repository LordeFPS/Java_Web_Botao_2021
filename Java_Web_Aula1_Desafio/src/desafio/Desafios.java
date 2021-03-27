package desafio;

import java.util.Locale;
import java.util.Scanner;

public class Desafios {
	
	static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//contaArea(2.00);
		produtoSimples();
	}
	
	public static void contaArea(double raio) {
		//area = pi * raio²
		// pi = 3.14159
		
		double area;
		
		area = 3.14159 * (raio * raio);
		
		System.out.printf("A = %.4f %n",  (area));
		
	}
	
	public static void produtoSimples() {
		//leia dois numero inteiros
		
		int valor1, valor2, PROD;
		
		System.out.print("Digite valor 1: ");
		valor1 = leitor.nextInt();
		System.out.print("Digite valor 2: ");
		valor2 = leitor.nextInt();
		
		PROD = valor1 * valor2;
		
		System.out.print("PROD = " + PROD);
		
		
	}
}
