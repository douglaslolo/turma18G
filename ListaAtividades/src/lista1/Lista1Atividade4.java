package lista1;

import java.util.Scanner;
	/* 4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
		
		D= R + S , onde 	R = (A + B)�
		   _____			S = (B + C)�
		   	 2
	*/

public class Lista1Atividade4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double R,S,D;
		int a,b,c;
		
		System.out.println("Informe o primeiro n�mero: ");
		a = leia.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		b = leia.nextInt();	
		System.out.println("Informe o terceiro n�mero: ");
		c = leia.nextInt();
		
		R=((a+b)^2);
		S=((b+c)^2);
		D=((R+S)/2);
		
		System.out.println("O resultado do c�lculo �: " + D);
	}
}