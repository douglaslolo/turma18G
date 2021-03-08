package lacosDeDecisao;

import java.util.Scanner;
import java.util.Arrays;
 	//2.Faça um programa que entre com três números e coloque em ordem crescente.

public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final double[] listaNumeros = new double[3];
				
		for(int i=0;i<listaNumeros.length;i++) {
			System.out.printf("Informe o %s° valor inteiro: ", i+1);
			listaNumeros[i] = leia.nextDouble();
		}
		
		Arrays.sort(listaNumeros);
			
		for(int i=0;i<listaNumeros.length;i++) {
			System.out.print(listaNumeros[i]+ "  ");		
		}
	}
}