package lista3;

import java.util.Scanner;
	/*2. Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos 
	os n�meros  de 1 at� ele. Ex.: o usu�rio entra 7, o programa vai mostrar 28, 
	pois  1+2+3+4+5+6+7=28.	
	*/

public class Lista3Atividade2DoWhile {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero =0, resultado=0;
		
		System.out.println("Informe um n�mero: ");
		numero = leia.nextInt();
		
		do {
			resultado = (resultado + numero);
			numero = (numero - 1);
		}
		while(numero >= 0);		
		System.out.println(resultado);
	}
}