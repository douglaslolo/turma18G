package lista1;

import java.util.Scanner;
	//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

public class Lista1Atividade1 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dia, ano, mes, total;
		
		System.out.println("Qual a sua idade expressa em dias? ");
		dia = leia.nextInt();
		System.out.println("Qual a sua idade expressa em meses? ");
		mes = leia.nextInt();
		System.out.println("Qual a sua idade expressa em anos? ");
		ano = leia.nextInt();
		
		total = (dia+(ano*365)+(mes*30));
		
		System.out.println("A sua idade expressa em dias é: " + total);	
	}
}
