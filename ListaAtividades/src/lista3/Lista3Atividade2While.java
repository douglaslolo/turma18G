package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;
	/*2. Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar 
	ele por tr�s  (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: 
	se o usu�rio digita 5,  deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
	*/

public class Lista3Atividade2While {
	
	public static void main(String[] args) {
		DecimalFormat duasCasas = new DecimalFormat();
		Scanner leia = new Scanner(System.in);
		double valorUsuario = 0;
		
		System.out.println("Informe um valor: ");
		valorUsuario = leia.nextDouble();
		
		while(valorUsuario <= 100) {
			valorUsuario = (valorUsuario * 3);
			System.out.println( "A sequ�ncia �: " + duasCasas.format(valorUsuario) + "\n");
		}
	}
}