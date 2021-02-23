programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		/* 3) Desenvolva um sistema em que:
			Leia 4 (quatro) números;
			Calcule o quadrado de cada um;
			Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
			Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		*/
		//variaveis
		real numero1,numero2,numero3,numero4,potencia1,potencia2,potencia3,potencia4
		//inicio
		escreva("Informe o primeiro número: ")
		leia(numero1)
		escreva("Informe o segundo número: ")
		leia(numero2)
		escreva("Informe o terceiro número: ")
		leia(numero3)
		escreva("Informe o quarto número: ")
		leia(numero4)
		//processo
		potencia1 = Matematica.potencia(numero1, 2)
		potencia2 = Matematica.potencia(numero2, 2)
		potencia3 = Matematica.potencia(numero3, 2)
		potencia4 = Matematica.potencia(numero4, 2)
		//saida
		se(potencia3 >= 1000){
			escreva("O terceiro número informado ", numero3,  " elevado a segunda potência é maior que 1000, sendo: " , Matematica.arredondar(potencia3, 2))
		}

		senao
		{
			escreva("Os seguintes valores são: ",numero1, " e o resultado do seu quadrado: ", potencia1 ," , ", numero2 ," e o resultado do seu quadrado: ", potencia2," , ", numero3 ," e o resultado do seu quadrado: ", potencia3 ," e ", numero4, " e o resultado do seu quadrado: ", potencia4)
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 132; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */