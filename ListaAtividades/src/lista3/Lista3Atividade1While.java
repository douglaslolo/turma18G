package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;
	/*1. Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no 
	final o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras
	dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve 
	parar quando o usuário fornecer um valor negativo.
	*/

public class Lista3Atividade1While {
	
	public static void main(String[] args) {
		DecimalFormat duasCasas = new DecimalFormat();
		Scanner leia = new Scanner(System.in);
		double media = 0, numUsuario= 0 , soma= 0, contador = 0;
		
		while(numUsuario>-1) {
			System.out.println("Informe um valor: ");
			numUsuario = leia.nextDouble();
			
			if(numUsuario >= 0){
			contador = (contador + 1);
			soma = (soma + numUsuario);
			media = (soma/contador);			
			}
		}
		System.out.println("A soma dos valores é: " + duasCasas.format(soma));
		System.out.println("\nA quantidade de números contados foi de: " + duasCasas.format(contador));
		System.out.println("\nA média é de: " + duasCasas.format(media));
	}
}