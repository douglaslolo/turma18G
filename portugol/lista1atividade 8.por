programa
{
	
	funcao inicio()
	     // O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
	      
	{
		real fabrica, custoFinal, custoImposto, custoDistribuidor, impostos = 0.45, distribuidor = 0.28

		escreva("Digite o custo de fábrica: ")
		leia(fabrica)

		custoDistribuidor = fabrica*distribuidor
		custoImposto = fabrica*impostos

		custoFinal = fabrica + custoDistribuidor + custoImposto

		escreva("O custo do consumidor é: " , custoFinal)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */