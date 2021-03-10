package lacosDeRepeticao;

import java.util.Scanner;
import java.text.DecimalFormat;
	/*5.Crie um programa que leia um número do teclado até que encontre um número igual a zero.
	No final, mostre a soma dos números digitados.(DO...WHILE)
	*/

public class Exercicio5 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat("0.00");
		double valorDigitado=0.00, soma=0.00;
		
		do {
			System.out.println("Informe um valor númerico: ");
			valorDigitado = leia.nextDouble();
			
			soma = soma + valorDigitado;			
		}
		while(valorDigitado != 0);
		
		System.out.println("A soma dos valores digitados foi de: " + duasCasas.format(soma));
	}
}