package exerciciosFor;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		System.out.println("Digite a tabuada que deseja: ");
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(n + "X" + i + "=" + n * i);
		}

		entrada.close();
	}
}
