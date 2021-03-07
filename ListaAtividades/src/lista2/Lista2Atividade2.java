package lista2;

import java.text.DecimalFormat;
import java.util.Scanner;
	/*2. Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário.
	E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o 
	excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho 
	vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.	 
	*/

public class Lista2Atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat();
		double numeroHoras,salarioNormal,horasExcedente, vale = 20.00, totalVale,salarioTotal;
		
		System.out.println("escreva o número de horas trabalhadas: ");
		numeroHoras = leia.nextDouble();
		
		salarioNormal = numeroHoras*10.00;
		
		if(numeroHoras > 50){
			horasExcedente = (numeroHoras-50);
			totalVale = horasExcedente*vale;
			salarioTotal = salarioNormal + totalVale;
			
			System.out.println("\nVocê excedeu 50 horas de trabalho.");
			System.out.println("\nO seu salário normal é de: " + duasCasas.format(salarioNormal) + "R$");
			System.out.println("\nO seu vale de horas excedente é de: "+ duasCasas.format(totalVale) + "R$");
			System.out.println("\nO seu salário total é de: " + duasCasas.format(salarioTotal) + "R$");
			
		}
		else if(numeroHoras <= 50) {
			System.out.println("\nO seu salário não excedeu 50 horas de trabalho.");
			System.out.println("\nO seu salário normal é de: " + duasCasas.format(salarioNormal) + "R$");			
		}
	}
}
