package lacosDeRepeticao;

import java.util.Scanner;
import java.text.DecimalFormat;
	/*6.Escrever um programa que receba vários números inteiros no teclado. 
	E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
	*/

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat("0.00");
		int valorDigitado=0,somaValorDigitado =0,contador=0;
		double media=0;

		do {
			System.out.println("Informe um valor númerico: ");
			valorDigitado = leia.nextInt();
			
			if(valorDigitado%3 == 0 && valorDigitado != 0) {
				somaValorDigitado = (somaValorDigitado + valorDigitado);
				contador = (contador + 1);
			}
		}
		while(valorDigitado != 0);
		media = somaValorDigitado/contador;
		
		System.out.println("A média dos números múltiplos de 3 é " + duasCasas.format(media) + ".");
	}

}
