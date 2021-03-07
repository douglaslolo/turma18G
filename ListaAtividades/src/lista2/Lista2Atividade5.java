package lista2;

import java.util.Scanner;
	/*5. A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o altamente
	poluentes do meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as 
	ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 
	1� e 2� grupo s�o intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser notificados 
	a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o adequada aos 
	diferentes grupos de empresas.
	*/

public class Lista2Atividade5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double indice;
		
		System.out.println("Informe o �ndice de polui��o do grupo: ");
		indice = leia.nextDouble();
		
		if(indice >= 0.05 && indice <= 0.25) {
			System.out.println("�ndice dentro dos padr�es aceit�veis.");	
		}
		else if(indice >= 0.26 && indice <= 0.29) {
			System.out.println("Fora dos �ndices legais,estado de alerta!!");
		}
		else if(indice >= 0.3 && indice <= 0.39) {
			System.out.println("Paraliza as atividades do 1� grupo.");		
		}
		else if(indice >= 0.4 && indice <= 0.49) {
			System.out.println("Paraliza as atividades do 1� e 2� grupo.");
		}
		else if(indice >= 0.5) {
			System.out.println("Paraliza as atividades do 1�, 2� e 3� grupo.");
		}
	}
}