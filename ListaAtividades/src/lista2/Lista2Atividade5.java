package lista2;

import java.util.Scanner;
	/*5. A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente
	poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as 
	indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 
	1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser notificados 
	a paralisarem suas atividades. Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos 
	diferentes grupos de empresas.
	*/

public class Lista2Atividade5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double indice;
		
		System.out.println("Informe o índice de poluição do grupo: ");
		indice = leia.nextDouble();
		
		if(indice >= 0.05 && indice <= 0.25) {
			System.out.println("Índice dentro dos padrões aceitáveis.");	
		}
		else if(indice >= 0.26 && indice <= 0.29) {
			System.out.println("Fora dos índices legais,estado de alerta!!");
		}
		else if(indice >= 0.3 && indice <= 0.39) {
			System.out.println("Paraliza as atividades do 1° grupo.");		
		}
		else if(indice >= 0.4 && indice <= 0.49) {
			System.out.println("Paraliza as atividades do 1° e 2° grupo.");
		}
		else if(indice >= 0.5) {
			System.out.println("Paraliza as atividades do 1°, 2° e 3° grupo.");
		}
	}
}