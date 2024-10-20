package exerciciosCondicional;
/*Fazer um programa para ler um número inteiro, e depois dizer se 
este número é negativo ou não.*/

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		int numero;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		numero = entrada.nextInt();

		if (numero < 0) {
			System.out.println("o numero é negativo");
		} else {
			System.out.println("o numero é positivo");
		}

		entrada.close();
	}
}
