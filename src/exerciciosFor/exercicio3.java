package exerciciosFor;

import java.util.Locale;
import java.util.Scanner;

/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem 
 a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com 
 uma casa decimal. Apresente a média ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo 
valor tem peso 3 e o terceiro valor tem peso 5*/
public class exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero ");
		int n = entrada.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite valor a: ");
			double a = entrada.nextDouble();
			System.out.println("Digite valor b: ");
			double b = entrada.nextDouble();
			System.out.println("Digite valor c: ");
			double c = entrada.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;// 10 é a soma dos pesos
			System.out.printf("MEDIA = %.1f%n", media);
		}

		System.out.println("FIM");
		entrada.close();
	}
}
