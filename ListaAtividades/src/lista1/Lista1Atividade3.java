package lista1;

import java.util.Scanner;
	/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos 
	e mostre-o expresso em horas, minutos e segundos.*/

public class Lista1Atividade3 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int tempoDuracao, horas, minutos, segundos;
		
		System.out.println("Digite o tempo de dura��o em segundos: ");
		tempoDuracao = leia.nextInt();
		
		horas = tempoDuracao / 3600;
		minutos = (tempoDuracao % 3600)/60;
		segundos = (tempoDuracao % 3600) % 60;
		
		System.out.println("Hora[s]: " + horas);
		System.out.println("\nMinutos[s]: " + minutos);
		System.out.println("\nSegundos[s]: " + segundos);	
	}
}
