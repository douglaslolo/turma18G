programa
{
	inclua biblioteca Matematica
	
	
	funcao inicio()
		//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
	{
		real n1, n2, n3, peso1 = 2, peso2 = 3, peso3 = 5, somaPesos= 10, media

		escreva("Escreva a primeira nota: ")
		leia(n1)
		escreva("Escreva a segunda nota: ")
		leia(n2)
		escreva("Escreva a terceira nota: ")
		leia(n3)

		media = ((n1*peso1) + (n2*peso2) + (n3*peso3))/somaPesos
		escreva("A média podenderada do aluno é de: ", (Matematica.arredondar(media, 2)))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */