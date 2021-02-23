programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
		/* PARA
		1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o 
		salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário;
		d) percentual de pessoas com salário até R$100,00.
		*/
	{	
		real salario=0,filhos=0,somaSalario=0,somaFilhos=0, percentual=0
		real mediaSalario=0,mediaFilhos=0,maiorSalario=0,percentualAte100RS=0
		const inteiro habitantes = 20
		
		para(inteiro x=1; x<=habitantes; x++)// podemos usar também x=x+1
		{
			escreva("Olá qual o seu salário?")
			leia(salario)
			somaSalario = (somaSalario+salario)
			
			escreva("E quantos filhos você tem?")
			leia(filhos)
			somaFilhos = (somaFilhos+filhos)
			
			se(salario>maiorSalario){
				maiorSalario=salario
			}

			se(salario <= 100){
				percentual++
			}
			
		}
			mediaSalario= somaSalario / habitantes
			mediaFilhos = somaFilhos / habitantes

			percentual=(percentual/habitantes)*100

		escreva("A média salarial da população é de: ",Matematica.arredondar(mediaSalario, 2), "\n")
		escreva("A média de número de filhos é de: ",Matematica.arredondar(mediaFilhos, 2), "\n")
		escreva("O maior salário foi de: ", Matematica.arredondar(maiorSalario, 2) ,"R$\n")
		escreva("O percentual de pessoas com salário até R$100,00 foi: ", Matematica.arredondar(percentual, 2),"%.")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 527; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */