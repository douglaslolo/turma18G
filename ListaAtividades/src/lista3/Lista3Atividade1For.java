package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;
	/*1. A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando 
	dados sobre o salário e número de filhos. A prefeitura deseja saber:   
	a) média do salário da população; 
	b) média do número de filhos; 
	c) maior salário; 
	d) percentual de pessoas com salário até R$100,00.  
	*/

public class Lista3Atividade1For {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat();
		int salario=0,filhos=0,somaSalario=0,somaFilhos=0, percentual=0;
		int mediaSalario=0,mediaFilhos=0,maiorSalario=0;
		final int habitantes = 20;
		
		for(int x=1; x<=habitantes; x++) {
			System.out.println("Olá qual o seu salário?");
			salario = leia.nextInt();
			somaSalario = (somaSalario+salario);
			
			System.out.println("E quantos filhos você tem?");
			filhos = leia.nextInt();
			somaFilhos = (somaFilhos+filhos);
			
			if(salario>maiorSalario) {
				maiorSalario=salario;
			}
			if(salario <= 100) {
				percentual++;
			}
		}
		
		mediaSalario = (somaSalario / habitantes);
		mediaFilhos = (somaFilhos / habitantes);
		percentual = ((percentual * 100)/habitantes);
				
		System.out.println("A média salarial da população é de: " + duasCasas.format(mediaSalario) + "R$\n");
		System.out.println("A média de número de filhos é de: " + duasCasas.format(mediaFilhos) + "\n");
		System.out.println("O maior salário foi de: " + duasCasas.format(maiorSalario) + "R$\n");
		System.out.println("O percentual de pessoas com salário até R$100,00 foi: " + duasCasas.format(percentual) + "%.");		
	}
}