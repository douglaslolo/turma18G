	package lista2;
	
import java.text.DecimalFormat;	
import java.util.Scanner;
	/*7. Receber valores de base e altura de um triângulo e verificar se são valores válidos 
	(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.	
	*/

public class Lista2Atividade7 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat();
		double base, altura, areaTriangulo;
		
		System.out.println("Informe o valor da base do triangulo: ");
		base = leia.nextDouble();
		
		System.out.println("Informe o valor da altura do triangulo: ");
		altura = leia.nextDouble();
		
		areaTriangulo = ((base*altura)/2);
				
		System.out.println("A área do triangulo é: " + duasCasas.format(areaTriangulo));
		
	}
}
