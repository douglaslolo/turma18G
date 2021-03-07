package lista2;

import java.util.Scanner;
	/*4. Faça um sistema que leia um número inteiro e mostre uma mensagem indicando 
	se este número é par ou ímpar, e se é positivo ou negativo.
	*/

public class Lista2Atividade4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um número inteiro (negativo ou positivo): ");
		num = leia.nextInt();
		
		if(num%2 == 0 && num >= 1) {
			System.out.println("Este número é par e positivo.");
		}
		else if(num%2 == 0 && num <= -1) {
			System.out.println("Este número é par e negativo.");
		}
		else if(num == 0) {
			System.out.println("Este número é 0 e zero é neutro.");
		}
		else if(num%2 == 1 && num >= -1) {
			System.out.println("Este número é impar e positivo.");
		}
		else {
			System.out.println("Este número é impar e negativo.");
		}
	}
}