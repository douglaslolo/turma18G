programa
{
	
	funcao inicio()
	/* 3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
     a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
     b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
     */
	{
		

		
		inteiro n1[][] = {{2,3,4,5,6,7},{2,5,6,7,8,9},{5,7,8,9,6,3},{1,2,5,6,7,5}}
		inteiro n2[][] = {{3,5,6,7,8,9},{9,7,2,2,3,4},{6,4,2,3,1,5},{7,6,4,6,8,9}}
		inteiro contadorLinha=0, contadorColuna=0
		inteiro m1[4][6],m2[4][6]



		para(contadorLinha=0;contadorLinha<4;contadorLinha++){

			para(contadorColuna=0;contadorColuna<6;contadorColuna++){
				m1[contadorLinha][contadorColuna] = n1[contadorLinha][contadorColuna] + n2[contadorLinha][contadorColuna]
				m2[contadorLinha][contadorColuna] = n1[contadorLinha][contadorColuna] - n2[contadorLinha][contadorColuna]
			}
			
		}
			
			para (contadorLinha = 0; contadorLinha < 4; contadorLinha++)
			{
				para (contadorColuna = 0; contadorColuna < 6; contadorColuna++)
				{
					escreva("\n[",m1[contadorLinha][contadorColuna],"]","[",m2[contadorLinha][contadorColuna], "]")
				}
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 13, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */