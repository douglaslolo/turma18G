package lacosDeDecisao;

import java.util.Scanner;
	/*4. Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba 
	se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
	se for �mpar exiba o n�mero elevado ao quadrado.
	*/

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valorEntrada;
		
		System.out.println("Informe um valor para verificar se ele � impar/par: ");
		valorEntrada = leia.nextInt();
		
		if(valorEntrada%2 == 0) {
			System.out.println("Este n�mero � par");
		}
		else {
			System.out.println("Este n�mero � impar");			
		}	
	}
}