package exerciciosWhile;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int valor=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite:\n[1.Alcool]\n[2.Gasolina]\n" + "[3.Diesel]\n[4.Fim ]");
		//valor = entrada.nextInt();

		while (valor != 4) {
			valor = entrada.nextInt();

			if (valor == 1) {
				alcool += 1;
				System.out.println("Alcool");
			} else if (valor == 2) {
				gasolina += 1;
				System.out.println("Gasolina");
			} else if (valor == 3) {
				diesel += 1;
				System.out.println("Diesel");
			}else if(valor < 1 || valor > 4) {
				System.out.println("Fora do intervalo");
				System.out.println("Digite novamente:");
			}

			if (valor == 4) {
				System.out.println("MUITO OBRIGADO!!!");
				System.out.println("======TOTAL=======");
				System.out.println("ALCOOL = "+ alcool);
				System.out.println("GASOLINA = "+ gasolina);
				System.out.println("DIESEL = "+ diesel);
			}

		}
		entrada.close();
	}
}
