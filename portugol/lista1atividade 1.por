programa
{
	
	funcao inicio()
	{    //1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
		
	     //variaveis
	     inteiro dia, ano, mes, total
	     

	     //entradas
		escreva("Qual a sua idade expressa em dias? ")
		leia(dia)
		escreva("Qual a sua idade expressa em meses? ")
		leia(mes)
		escreva("Qual a sua idade expressa em anos? ")
		leia(ano)

		//processamento
          total=(dia+(ano*365)+(mes*30))
          
		//saida
		escreva("A sua idade expressa em dias é: ", total)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 549; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */