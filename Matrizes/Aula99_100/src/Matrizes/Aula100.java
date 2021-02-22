package Matrizes;

import java.util.Scanner;

public class Aula100 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = ler.nextInt();
		int m = ler.nextInt();
		int [][] matriz =  new int[n][m];
		int i, j;
		
		for (i=0;i<n; i++) {
			for (j=0; j<m ; j++) {
				matriz[i][j]= ler.nextInt();
			}
		}
		int num = ler.nextInt();
		
		for (i=0;i<n; i++) { 
			for (j=0; j<m ; j++) {
				if(matriz[i][j]==num) {
					System.out.println("Positon "+i+", "+j);
					if(j-1>=0)
						System.out.println("Left: "+matriz[i][j-1]);
					if(j+1<m)
						System.out.println("Right: "+matriz[i][j+1]);
					if(i-1>=0)
						System.out.println("Up: "+matriz[i-1][j]);
					if(i+1<n)
						System.out.println("Down: "+matriz[i+1][j]);
				}
			}
		}
		

	}

}

/*casos de teste 
3 4 
10 8 15 12
21 11 23 8
14 5 13 19
8
*/