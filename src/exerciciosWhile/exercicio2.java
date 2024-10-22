package exerciciosWhile;
/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o 
quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma 
de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o valor de X");
	double x = entrada.nextDouble();
	System.out.println("Digite o valor de Y");
	double y = entrada.nextDouble();
	
	while(x != 0 && y != 0) {
		if (x > 0 && y > 0) {
			System.out.println("primeiro");
		}
		else if (x < 0 && y > 0) {
			System.out.println("segundo");
		}
		else if (x < 0 && y < 0) {
			System.out.println("terceiro");
		}
		else {
			System.out.println("quarto");
		}
		x = entrada.nextInt();
		y = entrada.nextInt();
	}
	entrada.close();
}
}
