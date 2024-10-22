package exerciciosFor;
/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X 
 que serão lidos em seguida.Mostre quantos destes valores X estão dentro do 
 intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, 
e "out" para fora do intervalo).*/
import java.util.Scanner;

public class exercicio2 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int dentro = 0;
	int fora = 0;
	
	System.out.println("Digite um numero ");
	int num = entrada.nextInt();
	
	for(int i =0; i< num; i++) {
		System.out.println("Digite "+ num +" numeros seguidos:");
		int x = entrada.nextInt();
		if (x >= 10 && x <= 20) {
			dentro = dentro+1;
		}else {
			fora = fora+1;
		}
		
	}
	System.out.println("Estão dentro: "+ dentro);
	System.out.println("Estão fora: "+ fora);
	
	entrada.close();
}
}
