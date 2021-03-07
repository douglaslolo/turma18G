package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;
	/*7. Um sistema de equações lineares do tipo: ax + by = c, pode ser resolvido segundo 
	   											  dx + ey = f
	mostrado abaixo: x = ce - bf   y = af - cd
						 _______       _______
						 ae - bd       ae - bd
	
	Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
	*/

public class Lista1Atividade7 {

	public static void main(String[] args) {		
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat("0.00");
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de a:");
		a = leia.nextDouble();
		System.out.println("Digite o valor de b:");
		b = leia.nextDouble();
		System.out.println("Digite o valor de c:");
		c = leia.nextDouble();
		System.out.println("Digite o valor de d:");
		d = leia.nextDouble();
		System.out.println("Digite o valor de e:");
		e = leia.nextDouble();
		System.out.println("Digite o valor de f:");
		f = leia.nextDouble();
		
		x = ((c*e)-(b*f)) / ((a*e)-(b*d));
		y = ((a*f)-(c*d)) / ((a*e)-(b*d));
		
		System.out.println("Valor de x: " + duasCasas.format(x));
		System.out.println("\nValor de y: " + duasCasas.format(y));		
	}
}
