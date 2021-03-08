package lacosDeDecisao;

import java.util.Scanner;
	//1.Faça um programa que receba três inteiros e diga qual deles é o maior.

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final int repeticoes=3;
		int maiorNumero=0, numero=0;
		
		for(int i=1;i<=repeticoes;i++) {
			
			System.out.printf("Informe o %d° valor inteiro: ", i);
			numero = leia.nextInt();
			
			if(numero >= maiorNumero) {
				maiorNumero = numero;
			}
		}
		System.out.printf("O maior número digitado foi: %d", maiorNumero);
	}
}