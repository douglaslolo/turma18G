package lista2;

import java.util.Scanner;
	/*8) Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se a 
	mesma for maior que 100, caso contr�rio imprimi-la com o valor zero.
	*/

public class Lista2Atividade8 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double N;
		
		System.out.println("informe um n�mero: ");
		N = leia.nextDouble();
		
		if(N > 100) {
			System.out.println(N);
		}
		else {
			System.out.println("0");
		}
	}
}
