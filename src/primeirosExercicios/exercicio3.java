package primeirosExercicios;
/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, 
 * calcule e mostre a diferença do produto de A e B pelo produto de C e D 
 * segundo a fórmula: DIFERENCA = (A * B - C * D).*/

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner entrada = new Scanner(System.in);
	
	int a, b, c, d, dif;
	System.out.println("Digite o valor de A: ");
	a= entrada.nextInt();
	
	System.out.println("Digite o valor de B: ");
	b= entrada.nextInt();
	
	System.out.println("Digite o valor de C: ");
	c= entrada.nextInt();
	
	System.out.println("Digite o valor de D: ");
	d= entrada.nextInt();
	
	dif = (a*b)- (c*d);
	
	System.out.println("DIFERENÇA = "+ dif);	
	entrada.close();
}
}
