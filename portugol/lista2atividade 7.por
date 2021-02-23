programa
{
	funcao inicio()
	/*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores 
	que zero). Em caso afirmativo, calcular a área do triângulo.
	*/
	{
		real base, altura, areaTriangulo
		escreva("Informe o valor da base do triangulo: ")
		leia(base)

		escreva("Informe o valor da altura do triangulo: ")
		leia(altura)

		areaTriangulo = ((base*altura)/2)

		escreva("A área do triangulo é: ", areaTriangulo)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */