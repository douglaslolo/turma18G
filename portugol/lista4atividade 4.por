programa
{
	
	funcao inicio()
	/* 4.Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
	exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	*/
	{
		real matriz[3][3],somaTotal=0.0,somaDiagonal=0.0	

		para(inteiro l=0;l<3;l++){
			para(inteiro c=0;c<3;c++){
				escreva("Informe o primeiro valor da posição [", l ,"] [",c,"]:")
				leia(matriz[l][c])
				somaTotal = (somaTotal + matriz[l][c])
				se(l==c){
					somaDiagonal += matriz[l][c]
				}
			}
		}
		escreva("Soma dos valores da matriz é: ", somaTotal)
		escreva("\nSoma dos valores da diagonal principal é: ",somaDiagonal)
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 9, 7, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */