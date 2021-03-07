package lista4;

	/*2.Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
	Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
	A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize 
	e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
	*/

public class Lista4Atividade2 {
	
	public static void main(String[] args) {
	
		final int totalRodadas = 10;
		int rodadas[] = new int[totalRodadas],maiorPontuacao=0,contadorOcorrencias=0,i;
		double media,soma=0.0;
		
		for(i=0; i< rodadas.length;i++) {
			rodadas[i] = (int) (Math.random() * 6) + 1;
			System.out.println("\nO n�mero sorteado foi: " + rodadas[i]);
			
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
		System.out.println("\nA m�dia simples dos n�meros sorteados � de: " + media);
		System.out.println("\nA maior pontua��o foi de: " + maiorPontuacao);
		System.out.println("\nA quantidade de vezes que o maior n�mero repetiu-se foi de: " + contadorOcorrencias);
	}	
}