package lista4;

	/*2.Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
	e apresente também quantas foram as ocorrências da maior pontuação.
	*/

public class Lista4Atividade2 {
	
	public static void main(String[] args) {
	
		final int totalRodadas = 10;
		int rodadas[] = new int[totalRodadas],maiorPontuacao=0,contadorOcorrencias=0,i;
		double media,soma=0.0;
		
		for(i=0; i< rodadas.length;i++) {
			rodadas[i] = (int) (Math.random() * 6) + 1;
			System.out.println("\nO número sorteado foi: " + rodadas[i]);
			
			soma = (soma + rodadas[i]);
			
			if(rodadas[i] > maiorPontuacao){
				maiorPontuacao = rodadas[i];
			}
		}
		
		for(i=0;i<rodadas.length;i++) {
			if(rodadas[i] == maiorPontuacao){
				contadorOcorrencias++;
			}
		}
		
		media = (soma/10);

		System.out.println("\nA soma dos valores foi de: " + soma);
		System.out.println("\nA média simples dos números sorteados é de: " + media);
		System.out.println("\nA maior pontuação foi de: " + maiorPontuacao);
		System.out.println("\nA quantidade de vezes que o maior número repetiu-se foi de: " + contadorOcorrencias);
	}	
}