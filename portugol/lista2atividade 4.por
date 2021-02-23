programa
{
	
	funcao inicio()
	{	
		/* 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou
		ímpar, e se é positivo ou negativo*/
		inteiro num
		
		escreva("Informe um número inteiro (negativo ou positivo): ")
		leia(num)
		
		//PAR
		se(num%2 == 0 e num >= 1){
			escreva("Este número é par e positivo")
		}
		senao se(num%2 == 0 e num <= -1){
			escreva("Este número é par e negativo")
		}
		
		//ZERO
		senao se(num == 0){
			escreva("Este número é 0 e zero é neutro.")
		}
			
		//IMPAR
		senao se(num%2 == 1 e num >= -1){
			escreva("Este número é impar e positivo")
		}
		senao {
			escreva("Este número é impar e negativo")
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */