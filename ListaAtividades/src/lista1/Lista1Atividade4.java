package lista1;

import java.util.Scanner;
	/* 4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
		
		D= R + S , onde 	R = (A + B)²
		   _____			S = (B + C)²
		   	 2
	*/

public class Lista1Atividade4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double R,S,D;
		int a,b,c;
		
		System.out.println("Informe o primeiro número: ");
		a = leia.nextInt();
		System.out.println("Informe o segundo número: ");
		b = leia.nextInt();	
		System.out.println("Informe o terceiro número: ");
		c = leia.nextInt();
		
		R=((a+b)^2);
		S=((b+c)^2);
		D=((R+S)/2);
		
		System.out.println("O resultado do cálculo é: " + D);
	}
}