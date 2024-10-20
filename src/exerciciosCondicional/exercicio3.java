package exerciciosCondicional;
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
 "Sao Multiplos" ou "Nao sao Multiplos", 
 indicando se os valores lidos são múltiplos entre si. 
 Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.*/

import java.util.Scanner;

public class exercicio3 {
public static void main(String[] args) {
	int a, b;
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um valor A: ");
	a= entrada.nextInt();
	
	System.out.println("Digite um valor B: ");
	b= entrada.nextInt();
	
	if(a% b ==0 || b%2 ==0) {
		System.out.println("Os numeros são multiplos");
	}else {
		System.out.println("Os numeros não são multiplos");
	}
	entrada.close();
}
}
