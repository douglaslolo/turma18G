package lacosDeDecisao;

import java.util.Scanner;
	//1.Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final int repeticoes=3;
		int maiorNumero=0, numero=0;
		
		for(int i=1;i<=repeticoes;i++) {
			
			System.out.printf("Informe o %d� valor inteiro: ", i);
			numero = leia.nextInt();
			
			if(numero >= maiorNumero) {
				maiorNumero = numero;
			}
		}
		System.out.printf("O maior n�mero digitado foi: %d", maiorNumero);
	}
}