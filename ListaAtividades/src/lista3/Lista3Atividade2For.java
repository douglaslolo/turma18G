package lista3;
	
	/*2. Desenvolver um sistema que efetue a soma de todos os n�meros 
	�mpares que s�o  m�ltiplos de tr�s e que se encontram no 
	conjunto dos n�meros de 1 at� 500.
	*/

public class Lista3Atividade2For {
	
	public static void main(String[] args) {
		int soma=0, cont =0;
		
		for(int i=0; i<=500; i+=2) {
			if(i % 3 == 0) {
				cont = (cont + 1);
				soma = (soma + i);
			}
		}
		System.out.println("A soma dos �mpares m�ltiplos de tr�s, contando de 1 at� 500 � de: " + soma + "\n");
		System.out.println("E a quantidade de n�meros contados foi de: " + cont);
	}
}