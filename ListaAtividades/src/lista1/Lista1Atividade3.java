package lista1;

import java.util.Scanner;
	/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos 
	e mostre-o expresso em horas, minutos e segundos.*/

public class Lista1Atividade3 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int tempoDuracao, horas, minutos, segundos;
		
		System.out.println("Digite o tempo de duração em segundos: ");
		tempoDuracao = leia.nextInt();
		
		horas = tempoDuracao / 3600;
		minutos = (tempoDuracao % 3600)/60;
		segundos = (tempoDuracao % 3600) % 60;
		
		System.out.println("Hora[s]: " + horas);
		System.out.println("\nMinutos[s]: " + minutos);
		System.out.println("\nSegundos[s]: " + segundos);	
	}
}
