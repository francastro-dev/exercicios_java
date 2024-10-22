package exerciciosFor;
/*Fazer um programa para ler um número N. Depois leia N pares de números e 
 mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, 
 mostrar a mensagem "divisao impossivel".*/

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero ");
		int n = entrada.nextInt();
		double divisao = 0;

		for (int i = 0; i <n; i++) {
			System.out.println("Digite valor a: ");
			double a = entrada.nextDouble();
			System.out.println("Digite valor b: ");
			double b = entrada.nextDouble();
			
			if (b == 0) {
				System.out.println("divisão impossivel");
			} else {
				divisao = a / b;
				System.out.printf("resultado da divisão = %.1f%n", divisao);
			}

		}
		System.out.println("Fim");
		entrada.close();
	}
}
