package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;
	/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
	P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �:
	 d = V (x2 - x1)� + (y2 - y1)�
	*/

public class Lista1Atividade6 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat("0.00");
		double d, x1, x2, y1, y2, p1, p2;
		
		
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		p1 = (x2 - x1);
		p2 = (y2 - y1);
		p1 = Math.pow(p1, 2); //Calcula um n�mero elevado a outro o p1 � a base o 2 � a potencia
		p2 = Math.pow(p2, 2); //Calcula um n�mero elevado a outro o p2 � a base o 2 � a potencia
		d = Math.sqrt((p1+p2)); //Calcula a raiz quadrada de um valor
		
		System.out.println("o valor de p1 foi de " + duasCasas.format(p1) + " e o valor de p2 foi de " + duasCasas.format(p2));
		System.out.println("Valor de d � de: " + duasCasas.format(d));
	}
}