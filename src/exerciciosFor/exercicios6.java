package exerciciosFor;

import java.util.Scanner;
import java.io.IOException;

/*Ler um número inteiro N e calcular todos os seus divisores.*/
public class exercicios6 {
	public static void main(String[] args) {
	
		System.out.println("Digite um número: ");
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();
		
		for(int i=1; i<=n;i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
		
		entrada.close();
}
}
