package lacosDeDecisao;

import java.util.Scanner;
	/*3.Fa�a um programa que receba a idade de uma pessoa e 
	mostre na sa�da em qual categoria ela se encontra:
	10-14 infantil
	15-17 juvenil
	18-25 adulto
	*/

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe a idade: ");
		idade = leia.nextInt();

		if(idade>=10 && idade<=14) {
			System.out.println("A categoria � infantil.");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("A categoria � juvenil.");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("A categoria � adulto.");
		}
		else {
			System.out.println("A informa��o inserida n�o se enquadra em nenhuma categoria.");
		}
	}
}