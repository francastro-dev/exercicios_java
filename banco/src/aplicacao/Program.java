package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Conta;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Conta conta;
		
		System.out.println("Insira o número da conta:");
		int numero = entrada.nextInt();
		
		entrada.nextLine();
		System.out.println("Insira o nome do titular:");
		String titular = entrada.nextLine();
		
		System.out.println("Tem depósito inicial? S/N");
		char resposta = entrada.next().charAt(0);
		if(resposta == 'S') {
			System.out.print("Digite o valor do depósito inicial");
			double depositoInicial = entrada.nextDouble();
			//instanciando a conta com o construtor de 3 argumentos
			conta = new Conta(numero, titular, depositoInicial);
		}else {
			conta = new Conta(numero, titular);
		}
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println("Conta " + conta);
		System.out.println();
		
		System.out.println();
		System.out.println("Digite um valor para depósito: ");
		double deposito = entrada.nextDouble();
		conta.deposito(deposito);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		//operação de saque:
		System.out.println();
		System.out.println("Digite um valor para saque: ");
		double saque = entrada.nextDouble();
		conta.saque(saque);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		entrada.close();
	}
}
