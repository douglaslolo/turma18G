package lacosDeDecisao;

import java.util.Scanner;
	/*4. Faça um programa em que permita a entrada de um número qualquer e exiba 
	se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
	se for ímpar exiba o número elevado ao quadrado.
	*/

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valorEntrada;
		
		System.out.println("Informe um valor para verificar se ele é impar/par: ");
		valorEntrada = leia.nextInt();
		
		if(valorEntrada%2 == 0) {
			System.out.println("Este número é par");
		}
		else {
			System.out.println("Este número é impar");			
		}	
	}
}