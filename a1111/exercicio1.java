package a1111;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double[] notas = new double[9];
		double notaTotal=0, maiorNota=0, posicaoMaior=0, media;
		int contador=0, contadorAlunosMedia=0;
		
		for(int i=0; i<notas.length; i++) {
			System.out.println("Digite a nota do aluno " +(i+1) +": ");
			notas[i] = ler.nextDouble();
            contador = i;
            notaTotal+=notas[i];
            
            if(notas[i]>=7) {
            	contadorAlunosMedia++;	
            }
            if(notas[i]>maiorNota) {
            	maiorNota=notas[i];
            	posicaoMaior=i;
            }
		}
		media = notaTotal/contador;
		
		System.out.println("Média geral da turma: " +media 
				+ "\nMaior nota da turma: " +maiorNota +" | N° do aluno com a maior nota: " +(posicaoMaior+1) 
				+"\nQuantidade de alunos acima da média: " +contadorAlunosMedia);

	}

}
