package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;
	/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do 
	distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do 
	distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de 
	fábrica de um carro e escreva o custo ao consumidor. 
	*/

public class Lista1Atividade8 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat duasCasas = new DecimalFormat();
		double fabrica, custoFinal, custoImposto, custoDistribuidor, impostos = 0.45, distribuidor = 0.28;
		
		System.out.println("Digite o custo de fábrica: ");
		fabrica = leia.nextDouble();
		
		custoDistribuidor = fabrica*distribuidor;
		custoImposto = fabrica*impostos;
		custoFinal = fabrica + custoDistribuidor + custoImposto;
		
		System.out.println("O custo do consumidor é: " + duasCasas.format(custoFinal));
	}
}