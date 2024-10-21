package exerciciosCondicional;

import java.util.Locale;
import java.util.Scanner;


public class exercicio7 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner entrada = new Scanner(System.in);
	
	double salario, imposto;
	imposto = 0;
	
	System.out.println("Digite o valor do Seu salário: ");
	salario = entrada.nextDouble();
	
	if(salario <= 2000.00) {
		System.out.println("Isento");
	}
	else if(salario <= 3000.00){
		imposto = (salario-2000.00)*8/100.00;
	}else if(salario <4500.00) {
		imposto = (salario-3000)*18/100 + 1000.00 *8/100.00;
	}else {
		imposto = (salario - 4500)*0.28 + 1000.00 *0.08 + 1500* 0.18;
	}
	System.out.printf("R$ %.2f%n", imposto);
	entrada.close();
	}
}
