package lista4;

import java.util.Scanner;
	/*3.Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
	*/

public class Lista4Atividade3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		int contadorLinha, contadorColuna;
		
		for(contadorLinha=0;contadorLinha<4;contadorLinha++) 
		{
			for(contadorColuna=0;contadorColuna<6;contadorColuna++)
			{
				N1[contadorLinha][contadorColuna] = (int) (Math.random() * 9)+1;
				N2[contadorLinha][contadorColuna] = (int) (Math.random() * 9)+1;
				
				M1[contadorLinha][contadorColuna] = N1[contadorLinha][contadorColuna] + N2[contadorLinha][contadorColuna];
				M2[contadorLinha][contadorColuna] = N1[contadorLinha][contadorColuna] - N2[contadorLinha][contadorColuna];
			}
		}
		
		for(contadorLinha=0;contadorLinha<4;contadorLinha++)
		{
			for (contadorColuna=0;contadorColuna<6;contadorColuna++)
			{
				System.out.println("\n[" + M1[contadorLinha][contadorColuna] + "]" + "[" + M2[contadorLinha][contadorColuna] + "]" );
			}
		}
	}
}