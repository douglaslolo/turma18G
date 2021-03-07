package lista2;

import java.text.DecimalFormat;
import java.util.Scanner;
	/*1. Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho.
	Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) 
	deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P 
	(peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor 
	da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
	*/

public class Lista2Atividade1 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat();
		double pesoTomate, excesso = 0.00, multaKg = 4.00;
		
		System.out.println("Informe o kg do tomate em n�meros: ");
		pesoTomate = leia.nextDouble();
		
		if(pesoTomate <= 50){
			System.out.println("N�o houve excesso pois o peso do tomate foi de: " + duasCasas.format(pesoTomate) + "kg e o valor a ser pago pela multa � de: " + excesso + "R$");
		}
		else {
			excesso = (pesoTomate-50);
			multaKg = (excesso*multaKg);
			
			System.out.println("Houve excesso pois o peso foi de " + duasCasas.format(pesoTomate) + "kg e a multa a ser paga � de: " + duasCasas.format(multaKg) + "R$");
		}
	}
}