package Matrizes;

import java.util.Scanner;
//Aula 99
public class Aula99{

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = ler.nextInt();
		int [][] matriz = new int[n][n];
		
		for (int i =0; i<n ; i++)
			for (int j =0; j<n ; j++) {
				matriz[i][j]=ler.nextInt();
			}
		System.out.print("Diagonal principal:");
		for (int i =0; i<n ; i++)
			for (int j =0; j<n ; j++) {
				if(i==j)
					System.out.print(" " +matriz[i][j]);
				
			}
		System.out.print("\nNumeros negativos:");
		for (int i =0; i<n ; i++)
			for (int j =0; j<n ; j++) {
				if(matriz[i][j]<0)
					System.out.print(" " +matriz[i][j]);
				
			}
	}

}
