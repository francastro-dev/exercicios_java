package exerciciosCondicional;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro e dizer 
se este número é par ou ímpar.*/

public class exercicio2 {
public static void main(String[] args) {
	int numero;

	Scanner entrada = new Scanner(System.in);

	System.out.println("Digite um numero: ");
	numero = entrada.nextInt();
	
	if(numero % 2 == 0) {
		System.out.println(" o numero é par");
	}else {
		System.out.println("O numero é impar");
	}
	
	entrada.close();
}
}
