package lista2;


import java.text.DecimalFormat;
import java.util.Scanner;
	/* 3. Desenvolva um sistema em que:
	Leia 4 (quatro) n�meros;
	Calcule o quadrado de cada um;
	Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
	 */

public class Lista2Atividade3 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat();		
		double numero1,numero2,numero3,numero4,potencia1,potencia2,potencia3,potencia4;
		
		System.out.println("Informe o primeiro n�mero: ");
		numero1 = leia.nextDouble();
		System.out.println("Informe o segundo n�mero: ");
		numero2 = leia.nextDouble();
		System.out.println("Informe o terceiro n�mero: ");
		numero3 = leia.nextDouble();
		System.out.println("Informe o quarto n�mero: ");
		numero4 = leia.nextDouble();
		
		potencia1 = Math.pow(numero1, 2);
		potencia2 = Math.pow(numero2, 2);
		potencia3 = Math.pow(numero3, 2);
		potencia4 = Math.pow(numero4, 2);
		
		if(potencia3 >= 1000) {
			System.out.println("O terceiro n�mero informado " + numero3 + " elevado a segunda pot�ncia � maior que 1000, sendo: " + duasCasas.format(potencia3));
		}
		else {
			System.out.println("Os seguintes valores s�o: " + numero1 + " e o resultado do seu quadrado: " + potencia1);
			System.out.println("Os seguintes valores s�o: " + numero2 + " e o resultado do seu quadrado: " + potencia2);
			System.out.println("Os seguintes valores s�o: " + numero3 + " e o resultado do seu quadrado: " + potencia3);
			System.out.println("Os seguintes valores s�o: " + numero4 + " e o resultado do seu quadrado: " + potencia4);		
		}
	}
}
