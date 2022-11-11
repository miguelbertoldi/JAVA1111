package a1111;

import java.util.Scanner;
import java.util.ArrayList;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();
		int ant=0, suc=0, p=0, im=0;
		
		for(int j=0; j!=-1; j=j) {
			System.out.println("Digite um valor: | Para parar digite -1: ");
			j = ler.nextInt();
			if(j!=-1) {
				if(j%2==0) {
					p++;
				}
				if(j%2!=0) {
					im++;
				}
				n.add(j);
			}
		}
		int[] par = new int[p];
		int[] impar = new int[im];
		
		for(int i=0; i<par.length; i++) {
			if(n.get(i)%2==0) {
				par[i]=n.get(i);
			}}
			
		for(int klm=0; klm<impar.length; klm++) {
			if(n.get(klm)%2!=0) {
				impar[klm]=n.get(klm);
			}
		}
		
		boolean troca=true; 
		int auxiliar;
		while (troca) {
			troca = false;
			for(int g=0; g<=(par.length-1); g++) {
				if(g<(par.length-1)) {
				if(par[g] > par[g+1]) {
					auxiliar = par[g];
					par[g] = par[g+1];
					par[g+1] = auxiliar;
					troca = true;
				}
			}
		}
		}
		while (troca) {
			troca = false;
			for(int g=0; g<=(impar.length-1); g++) {
				if(g<(impar.length-1)) {
				if(impar[g] < impar[g+1]) {
					auxiliar = impar[g];
					impar[g] = impar[g+1];
					impar[g+1] = auxiliar;
					troca = true;
				}
			}
		}
		}
		System.out.println("PARES: ");
		for(int esc=0; esc<par.length; esc++) {
			System.out.println(par[esc]);
		}
		System.out.println("ÍMPARES: ");
		for(int esc1=0; esc1<impar.length; esc1++) {
			System.out.println(impar[esc1]);
		}
		}
}



