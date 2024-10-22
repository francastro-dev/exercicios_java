package exerciciosFor;
/*Leia um valor inteiro X (1 <= X <= 1000). 
Em seguida mostre os ímpares de 1 até X, um valor por linha, 
inclusive o X, se for o caso.*/

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero entre 1 e 1000:");
		int num = entrada.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println("i= " + i);
			}
		}
		entrada.close();
	}
}
