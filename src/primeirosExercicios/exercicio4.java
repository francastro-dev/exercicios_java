package primeirosExercicios;
/*Fazer um programa que leia o número de um funcionário, seu número de horas 
 trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
 A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner entrada = new Scanner(System.in);
	
	int funcionario, horasTrabalhadas ;
	double valorhora, salario;
	
	System.out.println("digite o numero do funcionario: ");
	funcionario= entrada.nextInt();
	
	System.out.println("Digite a quantidade de horas trabalhadas: ");
	horasTrabalhadas = entrada.nextInt();
	
	System.out.println("Digite o valor da hora trabalhada: ");
	valorhora = entrada.nextDouble();
	
	System.out.println("NUMERO = "+ funcionario);
	salario = horasTrabalhadas * valorhora;
	System.out.printf("SALARIO = U$$%.2f%n ",salario);
	
	
	entrada.close();
}
}
