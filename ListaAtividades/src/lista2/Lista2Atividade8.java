package lista2;

import java.util.Scanner;
	/*8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a 
	mesma for maior que 100, caso contrário imprimi-la com o valor zero.
	*/

public class Lista2Atividade8 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double N;
		
		System.out.println("informe um número: ");
		N = leia.nextDouble();
		
		if(N > 100) {
			System.out.println(N);
		}
		else {
			System.out.println("0");
		}
	}
}
