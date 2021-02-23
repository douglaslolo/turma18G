programa
{
	
	funcao inicio()
	{
		/* 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas 
		 	trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por 
		 	hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o 
		 	na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale 
		 	R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.		
		*/
		real numeroHoras,salarioNormal,horasExcedente, vale = 20.00, totalVale,salarioTotal

		escreva("escreva o número de horas trabalhadas: ")
		leia(numeroHoras)

		salarioNormal = numeroHoras*10.00
		
		se (numeroHoras > 50)
		{    horasExcedente = (numeroHoras-50)
			totalVale = horasExcedente*vale

			salarioTotal = salarioNormal + totalVale
			
			escreva("\nVocê excedeu 50 horas de trabalho.")
			escreva("\nO seu salário normal é de: " , salarioNormal, "R$")
			escreva("\nO seu vale de horas excedente é de: ",totalVale ,"R$")
			escreva("\nO seu salário total é de: ", salarioTotal, "R$")
		}
		senao se(numeroHoras <= 50){
			escreva("\nO seu salário não excedeu 50 horas de trabalho.")
			escreva("\nO seu salário normal é de: ", salarioNormal, "R$")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 936; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */