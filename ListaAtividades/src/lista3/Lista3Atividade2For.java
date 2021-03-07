package lista3;
	
	/*
	
	*/

public class Lista3Atividade2For {
	
	public static void main(String[] args) {
		int soma=0, cont =0;
		
		for(int i=0; i<500; i+=2) {
			if(i % 3 == 0) {
				cont = (cont + 1);
				soma = (soma + i);
			}
		}
		System.out.println("A soma dos ímpares múltiplos de três, contando de 1 até 500 é de: " + soma + "\n");
		System.out.println("E a quantidade de números contados foi de: " + cont);
	}
}