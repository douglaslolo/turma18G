package lista4;

import java.util.Scanner;
	/*1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma 
	atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
	*/

public class Lista4Atividade1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final int totalValores = 5;
		int valores[] = new int[totalValores], maiorValor=0;
		
		for(int i=0;i<totalValores;i++) {
			System.out.printf("Informe o %d� valor inteiro: " , i+1);
			valores[i] = leia.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.printf("\nO valor %d � %d\n" , (i+1) , valores[i]);
			if(valores[i]> maiorValor) {
				maiorValor = valores[i];
			}
		}
		System.out.println("\nO maior valor �: " + maiorValor);
	}
}