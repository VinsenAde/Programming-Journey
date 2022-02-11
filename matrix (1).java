import java.util.Scanner;
import java.util.Array;
public class matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int matrixA[][] = new int[6][5];
		
		System.out.println("Matrix A");
		for(int i=0; i<matrixA.length; i++){
			for(int j=0; j<matrixA[0].length; j++){
				System.out.printf("Input the value of student score [%d][%d]: ", i, j);
				matrixA[i][j] = sc.nextInt();
			}
		}

			System.out.println();
	}
}