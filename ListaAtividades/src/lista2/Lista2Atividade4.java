package lista2;

import java.util.Scanner;
	/*4. Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando 
	se este n�mero � par ou �mpar, e se � positivo ou negativo.
	*/

public class Lista2Atividade4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um n�mero inteiro (negativo ou positivo): ");
		num = leia.nextInt();
		
		if(num%2 == 0 && num >= 1) {
			System.out.println("Este n�mero � par e positivo.");
		}
		else if(num%2 == 0 && num <= -1) {
			System.out.println("Este n�mero � par e negativo.");
		}
		else if(num == 0) {
			System.out.println("Este n�mero � 0 e zero � neutro.");
		}
		else if(num%2 == 1 && num >= -1) {
			System.out.println("Este n�mero � impar e positivo.");
		}
		else {
			System.out.println("Este n�mero � impar e negativo.");
		}
	}
}