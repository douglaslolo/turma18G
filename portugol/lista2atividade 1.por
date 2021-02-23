programa
{
	
	funcao inicio()
	{
		/* 1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu 
		  trabalho. 
		  Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado 
		  de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa 
		  que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se 
		  houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá 
		  pagar. 
		  Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/
		  
		//variaveis
		real pesoTomate, excesso = 0.00, multaKg = 4.00

		escreva("Informe o kg do tomate em números: ")
		leia(pesoTomate)


		//processamento e saida
		se(pesoTomate <= 50){
			
			escreva("Não houve excesso pois o peso do tomate foi de: " , pesoTomate , "kg e o valor a ser pago pela multa é de: ", excesso ,"R$")
		}
		senao{
			excesso = pesoTomate-50
			multaKg = excesso*multaKg
			
			escreva("Houve excesso pois o peso foi de " , pesoTomate , " e a multa a ser paga é de: ", multaKg ,"R$")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 631; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */