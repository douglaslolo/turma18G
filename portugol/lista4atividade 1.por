programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	/* 1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e 
	o escreva em seguida. Encontre após a maior pontuação e a apresente. 
	*/
	{
		inteiro valores[5],i,maiorValor=0

		para(i=0;i<5;i++)
		{
			escreva("Informe o ", (i+1), "° valor: ")
			leia(valores[i])
		}

		para(i=0;i<5;i++)
		{
			escreva("\nO valor ", (i+1), " é ", valores[i])
			se(valores[i]> maiorValor){
				maiorValor = valores[i]
			}
		}
			escreva("\nO maior valor é: ", maiorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 508; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */