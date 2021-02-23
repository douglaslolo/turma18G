programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
		//Um sistema de equações lineares do tipo: ax + by = c , pode ser resolvido segundo mostrado abaixo: x = ce - bf   y = af - cd
	     //                                         dx + ey = f                                                   ae - bd       ae - bd
		//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
	{
		real a, b, c, d, E, f, g, x, y
	
		escreva("Digite o valor de a:")
		leia(a)
		escreva("Digite o valor de b:")
		leia(b)
		escreva("Digite o valor de c:")
		leia(c)
		escreva("Digite o valor de d:")
		leia(d)
		escreva("Digite o valor de e:")
		leia(E)
		escreva("Digite o valor de f:")
		leia(f)

		x = ((c*E)-(b*f)) / ((a*E)-(b*d))
		y = ((a*f)-(c*d)) / ((a*E)-(b*d))

		escreva("Valor de x: ",Matematica.arredondar(x, 2))
		escreva("\nValor de y: ",Matematica.arredondar(y, 2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 906; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */