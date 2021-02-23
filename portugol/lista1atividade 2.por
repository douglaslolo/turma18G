programa
{
	
	funcao inicio()
	{    //2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

	     inteiro dias, ano, mes, dia
	     
		escreva("Qual a sua idade expressa em dias? ")
		leia(dias)

		ano = (dias/ 365)
		mes = (dias % 365)/30
		dia = (dias % 365) % 30

		escreva("A idade é " , ano," anos de idade ", mes, " meses e " , dia ," e dias.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */