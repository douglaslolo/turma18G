package lacosDeRepeticao;

import java.util.Scanner;
	/*4.	Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas 
	dos indiv�duos de uma regi�o.
	Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
	e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
	Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
	o n�mero de pessoas calmas; 
	o n�mero de mulheres nervosas; 
	o n�mero de homens agressivos; 
	o n�mero de outros calmos;
	o n�mero de pessoas nervosas com mais de 40 anos; 
	o n�mero de pessoas calmas com menos de 18 anos.
	*/

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int contador=1, idade=0, sexo=0, emocao=0;
		int pessoasCalmas=0, mulheresNervosa=0, homensAgressivos=0, outrosCalmos=0, nervososMais40=0,calmasmenos18=0;
		String switchSexo,switchEmocao;
		char opcao = 'S';
		
		while(opcao == 'S' && contador<= 2) {
			System.out.println("Informe a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Informe o seu sexo para isso digite: (1-feminino / 2-masculino / 3-Outros)");
			sexo = leia.nextInt();
			switch(sexo) {
			case 1:switchSexo="feminino";break;
			case 2:switchSexo="masculino";break;
			case 3:switchSexo="Outros";break;
			}
			
			System.out.println("Informe o estado emocional da pessoa (1-calma / 2-nervosa / 3-agressiva)");
			emocao = leia.nextInt();	
			switch(emocao) {
			case 1:switchEmocao="calma/o";break;
			case 2:switchEmocao="nervosa/o";break;
			case 3:switchEmocao="agressiva/o";break;
			}
			
			if(emocao == 1) {
				pessoasCalmas++;
			}
			if(sexo == 1 && emocao == 2) {
				mulheresNervosa++;
			}
			if(sexo == 2 && emocao == 3) {
				homensAgressivos++;
			}
			if(sexo == 3 && emocao == 1) {
				outrosCalmos++;
			}
			if(emocao == 2 && idade>40) {
				nervososMais40++;
			}
			if(emocao == 1 && idade<18) {
				calmasmenos18++;
			}
			
			if(contador < 2) {
				System.out.println("Continua S-sim ou N-n�o? ");
				opcao = leia.next().toUpperCase().charAt(0);
				if (opcao != 'S') {
					break;
				}
			}
			contador++;

		}
		System.out.printf("\nA quantidade de pessoas calmas �: %d.",pessoasCalmas);
		System.out.printf("\nA quantidade de mulheres nervosas �: %d.",mulheresNervosa);
		System.out.printf("\nA quantidade de homens agressivos �: %d.",homensAgressivos);
		System.out.printf("\nA quantidade de outros calmos � de: %d.",homensAgressivos);
		System.out.printf("\nA quantidade de pessoas nervosas com mais de 40 anos �: %d.",nervososMais40);
		System.out.printf("\nA quantidade de pessoas calmas com menos de 18 anos �: %d.",calmasmenos18);
	}
}