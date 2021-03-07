package lista1;

import java.util.Scanner;
	/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
	Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
	*/
	
public class Lista1Atividade5 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n1, n2, n3, peso1 = 2, peso2 = 3, peso3 = 5, somaPesos= 10, media;
		
		System.out.println("Escreva a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.println("Escreva a segunda nota: ");
		n2 = leia.nextDouble();
		System.out.println("Escreva a terceira nota: ");
		n3 = leia.nextDouble();
		
		media = (((n1*peso1) + (n2*peso2) + (n3*peso3))/somaPesos);
		
		System.out.println("A média podenderada do aluno é de: " + media);
	}
}