package exerciciosCondicional;
/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração 
 do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, 
 tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import java.util.Scanner;

public class exercicio4 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	 int horaInicial, horaFinal, duracao;
	 
	 System.out.println("Digite a hora de inicio da partida: ");
	 horaInicial = entrada.nextInt();
	 System.out.println("Digite a hora de término da partida: ");
	 horaFinal = entrada.nextInt();
	 
	if(horaInicial < horaFinal) {
		duracao = horaFinal - horaInicial;
	}else {
		duracao = (24 - horaInicial) + horaFinal;
		
	}
	System.out.println("o jogo durou : "+ duracao + " Horas");
	entrada.close();
}
}
