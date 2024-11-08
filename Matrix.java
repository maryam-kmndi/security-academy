package ir.isc.exercise;

public class Matrix {

	public static void main(String[] args) {
		int n = 4;
		int[][] matrix = new int[n][n];
		System.out.println(n + "*" + n + " matrix");
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++) {
				matrix [i][j] = (Math.random() < 0.5 ? 0 : 1);
				System.out.print( matrix[i][j]  + "\t");
			}
		     System.out.println();
		}
	}
}


