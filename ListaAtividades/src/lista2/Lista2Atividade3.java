package lista2;


import java.text.DecimalFormat;
import java.util.Scanner;
	/* 3. Desenvolva um sistema em que:
	Leia 4 (quatro) números;
	Calcule o quadrado de cada um;
	Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	 */

public class Lista2Atividade3 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat();		
		double numero1,numero2,numero3,numero4,potencia1,potencia2,potencia3,potencia4;
		
		System.out.println("Informe o primeiro número: ");
		numero1 = leia.nextDouble();
		System.out.println("Informe o segundo número: ");
		numero2 = leia.nextDouble();
		System.out.println("Informe o terceiro número: ");
		numero3 = leia.nextDouble();
		System.out.println("Informe o quarto número: ");
		numero4 = leia.nextDouble();
		
		potencia1 = Math.pow(numero1, 2);
		potencia2 = Math.pow(numero2, 2);
		potencia3 = Math.pow(numero3, 2);
		potencia4 = Math.pow(numero4, 2);
		
		if(potencia3 >= 1000) {
			System.out.println("O terceiro número informado " + numero3 + " elevado a segunda potência é maior que 1000, sendo: " + duasCasas.format(potencia3));
		}
		else {
			System.out.println("Os seguintes valores são: " + numero1 + " e o resultado do seu quadrado: " + potencia1);
			System.out.println("Os seguintes valores são: " + numero2 + " e o resultado do seu quadrado: " + potencia2);
			System.out.println("Os seguintes valores são: " + numero3 + " e o resultado do seu quadrado: " + potencia3);
			System.out.println("Os seguintes valores são: " + numero4 + " e o resultado do seu quadrado: " + potencia4);		
		}
	}
}
