package primeirosExercicios;

import java.util.Scanner;

/* Faça um programa para ler dois valores inteiros,e depois mostrar na tela a 
 * soma desses números com uma mensagem explicativa*/

public class exercicio1 {
	public static void main(String[] args) {
		int a,b, soma ;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b= entrada.nextInt();
		
		soma = a + b;
		System.out.println(" SOMA = " + soma);
		
		
		entrada.close();
	}
	

}
