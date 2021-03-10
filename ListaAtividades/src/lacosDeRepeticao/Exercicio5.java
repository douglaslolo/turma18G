package lacosDeRepeticao;

import java.util.Scanner;
import java.text.DecimalFormat;
	/*5.Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
	No final, mostre a soma dos n�meros digitados.(DO...WHILE)
	*/

public class Exercicio5 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat("0.00");
		double valorDigitado=0.00, soma=0.00;
		
		do {
			System.out.println("Informe um valor n�merico: ");
			valorDigitado = leia.nextDouble();
			
			soma = soma + valorDigitado;			
		}
		while(valorDigitado != 0);
		
		System.out.println("A soma dos valores digitados foi de: " + duasCasas.format(soma));
	}
}