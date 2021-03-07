package lista1;

import java.util.Scanner;
	//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

public class Lista1Atividade2 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dia, ano, mes, dias;
		
		System.out.println("Qual a sua idade expressa em dias? ");
		dias = leia.nextInt();
		
		ano = (dias/ 365);
		mes = (dias % 365)/30;
		dia = (dias % 365) % 30;
		
		System.out.println("A idade é " + ano +" anos de idade "+ mes + " meses e " + dia +" e dias.");
	}

}
