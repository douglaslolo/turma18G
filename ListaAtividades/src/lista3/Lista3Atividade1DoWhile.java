package lista3;


	/*1. Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 
	3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
	*/

public class Lista3Atividade1DoWhile {
	public static void main(String[] args) {

		int contagem = 233;
		
		do {
			if(contagem >= 300) {
				contagem = (contagem + 5);				
			}
			else {
				contagem = (contagem + 3);
			}
			System.out.println(contagem + "\n");
		}
		while(contagem < 400);		
	}
}