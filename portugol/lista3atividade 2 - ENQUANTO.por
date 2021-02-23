programa
{
	inclua biblioteca Matematica	
	funcao inicio()
	/* 2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
	(imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
	deveremos observar na tela a seguinte sequência: 5 15 45 135.
	*/
	{
		real valorUsuario = 0

		escreva("Informe um valor: ")
		leia(valorUsuario)

		enquanto(valorUsuario <= 100)
		{
			valorUsuario = (valorUsuario * 3)
			escreva( "A sequência é: ", Matematica.arredondar(valorUsuario, 2), "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 555; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */