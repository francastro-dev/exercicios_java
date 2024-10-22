package exerciciosFor;
/*Ler um valor N. Calcular e escrever seu respectivo fatorial. 
Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero ");
		int n = entrada.nextInt();

		int f = 1;

		for (int i = 1; i <= n; i++) {
			//System.out.println(i + "*" + f + "=" + i * f); apenas para detalhar// 
			f = f * i;

		}
		System.out.println("Fatorial de " + n + " = " + f);
		entrada.close();
	}
}
