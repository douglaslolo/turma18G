package lacosDeRepeticao;

import java.util.Scanner;
	/*3. Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 	Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
	*/
public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade=0, contadorMenos21=-1, contadorMais50=0;
		
		while(idade != -99) {
			System.out.printf("Olá, informe a sua idade: ");
			idade = leia.nextInt();
			
			if(idade <21) {
				contadorMenos21++;
			}
			else if(idade >50){
				contadorMais50++;
			}
		}
		System.out.printf("\nO total de pessoas com menos de 21 anos foi de %d ", contadorMenos21);
		System.out.printf("\nO total de pessoas com mais de 50 anos foi de %d", contadorMais50);
	}
}