package exerciciosCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o valor de X");
	double x = entrada.nextDouble();
	System.out.println("Digite o valor de Y");
	double y = entrada.nextDouble();
	
	if (x == 0.0 && y == 0.0) {
		System.out.println("Origem");
	}/*
	else if (x == 0.0) {
		System.out.println("Eixo Y");
	}
	else if (y == 0.0) {
		System.out.println("Eixo X");
	}*/
	else if (x > 0.0 && y > 0.0) {
		System.out.println("Q1");
	}
	else if (x < 0.0 && y > 0.0) {
		System.out.println("Q2");
	}
	else if (x < 0.0 && y < 0.0) {
		System.out.println("Q3");
	}
	else {
		System.out.println("Q4");
	}
	entrada.close();
	}
}	
	
