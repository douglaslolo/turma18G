package lista4;

import java.util.Scanner;
	/*4.Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
	exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	*/

public class Lista4Atividade4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double matriz[][] = new double[3][3],somaTotal=0.0,somaDiagonal=0.0;
		
		for(int l=0;l<3;l++){
			for(int c=0;c<3;c++){				
				System.out.println("Informe o primeiro valor da posição ["+ l +"] ["+ c +"]:");
				matriz[l][c] = leia.nextDouble();
				
				somaTotal = (somaTotal + matriz[l][c]);
				
				if(l==c){
					somaDiagonal += matriz[l][c];
				}
			}
		}
		System.out.println("Soma dos valores da matriz é: "+somaTotal);
		System.out.println("\nSoma dos valores da diagonal principal é: "+somaDiagonal);
	}
}