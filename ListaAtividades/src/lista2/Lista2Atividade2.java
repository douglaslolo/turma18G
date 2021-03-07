package lista2;

import java.text.DecimalFormat;
import java.util.Scanner;
	/*2. Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio.
	E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 50 calcule o 
	excesso de pagamento armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de trabalho 
	vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio excedente.	 
	*/

public class Lista2Atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat();
		double numeroHoras,salarioNormal,horasExcedente, vale = 20.00, totalVale,salarioTotal;
		
		System.out.println("escreva o n�mero de horas trabalhadas: ");
		numeroHoras = leia.nextDouble();
		
		salarioNormal = numeroHoras*10.00;
		
		if(numeroHoras > 50){
			horasExcedente = (numeroHoras-50);
			totalVale = horasExcedente*vale;
			salarioTotal = salarioNormal + totalVale;
			
			System.out.println("\nVoc� excedeu 50 horas de trabalho.");
			System.out.println("\nO seu sal�rio normal � de: " + duasCasas.format(salarioNormal) + "R$");
			System.out.println("\nO seu vale de horas excedente � de: "+ duasCasas.format(totalVale) + "R$");
			System.out.println("\nO seu sal�rio total � de: " + duasCasas.format(salarioTotal) + "R$");
			
		}
		else if(numeroHoras <= 50) {
			System.out.println("\nO seu sal�rio n�o excedeu 50 horas de trabalho.");
			System.out.println("\nO seu sal�rio normal � de: " + duasCasas.format(salarioNormal) + "R$");			
		}
	}
}
