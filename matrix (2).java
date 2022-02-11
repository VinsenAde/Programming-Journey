import java.util.Scanner;

public class matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int matrixA[][] = new int[2][3];
		int matrixB[][] = new int[2][3];
		int matrixC[][] = new int[2][3];
		
		System.out.println("Matrix A");
		for(int i=0; i<matrixA.length; i++){
			for(int j=0; j<matrixA[0].length; j++){
				System.out.printf("Input the value of matrix A [%d][%d]: ", i, j);
				matrixA[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix B");
		for(int i=0; i<matrixB.length; i++){
			for(int j=0; j<matrixB[0].length; j++){
				System.out.printf("Input the value of matrix B [%d][%d]: ", i, j);
				matrixB[i][j] = sc.nextInt();
			}
		}
		System.out.println("The result of addition between matrix A and B are: ");
		for(int i=0; i<matrixC.length; i++){
			for(int j=0; j<matrixC[0].length; j++){
				matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
				System.out.print(matrixC[i][j] +" ");
			}
			System.out.println();
		}
	}
}