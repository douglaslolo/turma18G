programa
{
	inclua biblioteca Util
	
	funcao inicio()
	/* 2.Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com 
	os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, 
	contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	*/
	{
		inteiro rodadas[10],maiorPontuacao=0,contadorOcorrencias=0,i
		real media,soma=0.0
		//dado[6]
				
		
		para(i=0; i<10;i++){
			rodadas[i] = Util.sorteia(1, 6)
			escreva("\nO número sorteado foi: " + rodadas[i])
			
			soma = (soma + rodadas[i])
			
			se(rodadas[i]> maiorPontuacao){
				maiorPontuacao = rodadas[i]
			}
		}
			
		para(i=0;i<10;i++){
			se(rodadas[i] == maiorPontuacao){
				contadorOcorrencias++	
			}
		}
		media = (soma/10)
		
		escreva("\nA soma dos valores foi de: ", soma)
		escreva("\nA média simples dos números sorteados é de: ", media)
		escreva("\nA maior pontuação foi de: " , maiorPontuacao)
		escreva("\nA quantidade de vezes que o maior número repetiu-se foi de: ", contadorOcorrencias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 783; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */