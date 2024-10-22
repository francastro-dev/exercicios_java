package exerciciosFor;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro positivo N. 
O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, 
depois o quadrado e o cubo do valor, conforme exemplo.*/
public class exercicio7 {
public static void main(String[] args) {
	System.out.println("Digite um número: ");
	Scanner entrada = new Scanner(System.in);
	double quadrado =0;
	double cubo = 0;
	
	
	int n = entrada.nextInt();
	
	for(int i =1; i<= n; i++) {
		quadrado = Math.pow(i, 2);
		cubo = Math.pow(i, 3);
		
		System.out.printf("%d %.0f %.0f%n",i, quadrado, cubo );
	}
	
	entrada.close();
}
}
