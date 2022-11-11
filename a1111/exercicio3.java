package a1111;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] primeiro = new int[5];
		int[] segundo = new int[5];
		int[] diferenca = new int[5];
		int[] soma = new int[5];
		int[] multiplicacao = new int[5];
		
		for(int i=0; i<primeiro.length; i++) {
			System.out.println("Digite um número: ");
			primeiro[i] = ler.nextInt();
			System.out.println("Digite um número: ");
			segundo[i] = ler.nextInt();
		}
		for(int j=0; j<primeiro.length; j++) {
			diferenca[j] = primeiro[j] - segundo[j];
			soma[j] = primeiro[j] + segundo[j];
			multiplicacao[j] = primeiro[j] * segundo[j];
		}
		System.out.println("Vetor 'diferença': ");
		for(int dif=0; dif<primeiro.length; dif++) {
			System.out.println(diferenca[dif]);
		}
		System.out.println("Vetor 'soma': ");
		for(int som=0; som<primeiro.length; som++) {
			System.out.println(soma[som]);
		}
		System.out.println("Vetor 'multiplicação': ");
		for(int mul=0; mul<primeiro.length; mul++) {
			System.out.println(multiplicacao[mul]);
		}
		
	}

}
