package a1111;

import java.util.Scanner;
import java.util.ArrayList;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();
		ArrayList<Integer> alunos = new ArrayList<Integer>();
		int contadorAluno=0, contadorNotas=0;
		double notaFinal=0, mediaAluno, totalAluno=0, totalTurma=0, mediaTurma=0, nota;
		
		for(int resp=0; resp!=-1; resp=resp) {
			if(contadorAluno>0) {
		System.out.println("\nDeseja continuar? \n1 - Sim \n-1 - Não");
		resp = ler.nextInt();
			}
			contadorAluno++;
			if(resp!=-1) {
				alunos.add(resp);
			for(double peso=0; peso!=(-1); peso=peso) {
			System.out.println("\nDigite o peso da prova: | Para parar digite -1: ");
			peso = ler.nextDouble();
			if(peso!=-1) {
			System.out.println("\nDigite a nota do aluno " +contadorAluno +": ");
			nota = ler.nextDouble();
			notaFinal = (nota/peso)*10;
			notas.add(notaFinal);
			totalAluno+=notaFinal;
			contadorNotas++;
		}else {
			mediaAluno = totalAluno/contadorNotas;
			totalTurma+=mediaAluno;
			System.out.println("Média do aluno " +(contadorAluno) +": " +mediaAluno);
			mediaAluno = 0;
			totalAluno = 0;
			contadorNotas = 0;
		}}
		}
		}
		mediaTurma = totalTurma/alunos.size();
		System.out.println("\nMédia geral da turma: " +mediaTurma);
		
	}

}
