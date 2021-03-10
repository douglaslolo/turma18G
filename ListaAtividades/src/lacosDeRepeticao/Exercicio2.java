package lacosDeRepeticao;

//2.Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int numAleatorio[] = new int[10];
		int qntdImpar=0, qntdPar=0;
		
		for(int i=0;i<numAleatorio.length;i++) {
			numAleatorio[i] = (int) (Math.random() * 10) + 1;
			
			System.out.printf("\nO %d° número sorteado e impresso foi: %d", i+1, numAleatorio[i] );
			
			if(numAleatorio[i]%2 == 0) {
				qntdPar = qntdPar + 1;
			}
			else {
				qntdImpar = qntdImpar + 1;
			}
		}
		System.out.printf("\nA quantidade de números pares é %d. ", qntdPar);
		System.out.printf("\nA quantidade de números pares é %d. ", qntdImpar);
	}
}