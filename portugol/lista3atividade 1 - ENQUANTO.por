programa
{
	inclua biblioteca Matematica
	funcao inicio()
		/*
		1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total 
		do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o
		usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um 
		valor negativo.
	 	*/
	{	
		real media = 0, numUsuario= 0 , soma= 0, contador = 0
		
		enquanto (numUsuario>-1){
			escreva("Informe um valor: ")
			leia(numUsuario)	
	
			se(numUsuario >= 0){
			contador = (contador + 1)
			soma = (soma + numUsuario)
			media = (soma/contador)
			}
		}
		escreva("A soma dos valores é: ", soma)
		escreva("\nA quantidade de números contados foi de: ", contador)
		escreva("\nA média é de: ", Matematica.arredondar(media, 2))		
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */