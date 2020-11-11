package matriz;

import java.util.Scanner;

public class Matrizes {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				int a = sc.nextInt();
				mat[i][j] = a;
			}
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position " + i + "," + j);
					if(j != 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j != (n-1)) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i != 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(i != (m-1)) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					
				}
			}
		}
		sc.close();
	}
	

}
