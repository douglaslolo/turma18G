package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;
	/*1. A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando 
	dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:   
	a) m�dia do sal�rio da popula��o; 
	b) m�dia do n�mero de filhos; 
	c) maior sal�rio; 
	d) percentual de pessoas com sal�rio at� R$100,00.  
	*/

public class Lista3Atividade1For {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat();
		int salario=0,filhos=0,somaSalario=0,somaFilhos=0, percentual=0;
		int mediaSalario=0,mediaFilhos=0,maiorSalario=0;
		final int habitantes = 20;
		
		for(int x=1; x<=habitantes; x++) {
			System.out.println("Ol� qual o seu sal�rio?");
			salario = leia.nextInt();
			somaSalario = (somaSalario+salario);
			
			System.out.println("E quantos filhos voc� tem?");
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
				
		System.out.println("A m�dia salarial da popula��o � de: " + duasCasas.format(mediaSalario) + "R$\n");
		System.out.println("A m�dia de n�mero de filhos � de: " + duasCasas.format(mediaFilhos) + "\n");
		System.out.println("O maior sal�rio foi de: " + duasCasas.format(maiorSalario) + "R$\n");
		System.out.println("O percentual de pessoas com sal�rio at� R$100,00 foi: " + duasCasas.format(percentual) + "%.");		
	}
}