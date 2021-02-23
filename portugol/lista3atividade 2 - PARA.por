programa
{
	
	funcao inicio()
			/* PARA
			2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e 
			que se encontram no conjunto dos números de 1 até 500.
  			*/
	{
		//inteiro

		inteiro soma=0, cont =0
		
		para(inteiro i=1; i<500; i+=2){

			se(i % 3 == 0){
				cont = (cont + 1)
				soma = (soma + i)
			}	
		}
		escreva("A soma dos ímpares múltiplos de três, contando de 1 até 500 é de: ", soma, "\n")
		escreva("E a quantidade de números contados foi de: ", cont)

		
		//escreva("Olá Mundo")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */