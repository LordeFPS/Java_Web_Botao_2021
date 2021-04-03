package desafio;

import java.util.Locale;
import java.util.Scanner;

public class Desafios {
	
	static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//contaArea();
		//produtoSimples();
		bemVindo();
	}
	
	public static void contaArea() {
		//area = pi * raio²
		// pi = 3.14159
		Locale.setDefault(Locale.US);
		
		double area, raio;
		
		System.out.println("Digite o valor do raio: ");
		raio = leitor.nextDouble();
		
		area = 3.14159 * (raio * raio);
		
		System.out.printf("A = %.4f %n",  (area));
		
		leitor.close();
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
			
		leitor.close();
	}
	
	public static void bemVindo() {
		System.out.println("Digite alguma mensagem.");
		String hello = leitor.nextLine();
		System.out.println(hello);
		leitor.close();
	}

}