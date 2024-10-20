package primeirosExercicios;
/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
	o valor unitário de cada peça 1, o código de uma peça 2, 
	o número de peças 2 e o valor unitário de cada peça 2. 
	Calcule e mostre o valor a ser pago.*/

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner entrada = new Scanner(System.in);
	
	int codigoUm, codigoDois, num1, num2;
	double valorUm, valorDois, valorFinal;
	
	System.out.println("Digite o codigo da peça: ");
	codigoUm = entrada.nextInt();
	System.out.println("Digite a quantidade de peças: ");
	num1 = entrada.nextInt();
	System.out.println("Digite o valor da peça 1: ");
	valorUm = entrada.nextDouble();
	
	System.out.println("Digite o codigo da peça: ");
	codigoDois = entrada.nextInt();
	System.out.println("Digite a quantidade de peças 2: ");
	num2 = entrada.nextInt();
	System.out.println("Digite o valor da peça 2: ");
	valorDois = entrada.nextDouble();
	
	valorFinal = num1*valorUm + num2*valorDois;
	
	System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorFinal);
	entrada.close();
}
}
