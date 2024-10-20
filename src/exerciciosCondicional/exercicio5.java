package exerciciosCondicional;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item
 e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar
 1 cachorro quente - R$ 4,00
 2 x-salada  - R$ 4,50
 3 X-Bacon - R$ 5,00
 4 Torrada Simples - R$ 2,00
 5 Refrigerante - R$ 1,50 
 */
import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int quantidade, codigo;
		double total;
		
		System.out.println("Digite o codigo do produto de 1 a 5: ");
		codigo = entrada.nextInt();
		System.out.println("Digite a quantidade de itens: ");
		quantidade = entrada.nextInt();
		
		if(codigo == 1) {
			total = quantidade * 4.00;
		}else if(codigo ==2) {
			total = quantidade * 4.50;
		}else if(codigo == 3) {
			total = quantidade * 5.00;
		}else if(codigo == 4) {
			total = quantidade * 2.00;
		}else {
			total = quantidade * 1.5;
		}
		
		System.out.printf("Total a pagar: R$%.2f%n", total);
		
		entrada.close();
	}
}
