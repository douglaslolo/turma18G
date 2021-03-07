package lista2;

import java.text.DecimalFormat;
import java.util.Scanner;
	/*1. João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
	Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
	deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P 
	(peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor 
	da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
	*/

public class Lista2Atividade1 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat();
		double pesoTomate, excesso = 0.00, multaKg = 4.00;
		
		System.out.println("Informe o kg do tomate em números: ");
		pesoTomate = leia.nextDouble();
		
		if(pesoTomate <= 50){
			System.out.println("Não houve excesso pois o peso do tomate foi de: " + duasCasas.format(pesoTomate) + "kg e o valor a ser pago pela multa é de: " + excesso + "R$");
		}
		else {
			excesso = (pesoTomate-50);
			multaKg = (excesso*multaKg);
			
			System.out.println("Houve excesso pois o peso foi de " + duasCasas.format(pesoTomate) + "kg e a multa a ser paga é de: " + duasCasas.format(multaKg) + "R$");
		}
	}
}