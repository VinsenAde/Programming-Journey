import java.util.Scanner;

public class test{
	static int[][] inputMatrix(int arr[][]){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				System.out.print("Input data " +i+ " " +j+ ": ");
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	static void displayMatrix(int arr[][]){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
		System.out.println();
		}
	}
	static void sumRowColumn(int arr[][]){
		for(int i=0; i<arr.length; i++){
			int total=0;
			for(int j=0; j<arr[0].length; j++){
				total += arr[i][j];
			}
			System.out.println("Total number within row " +(i+1)+ " is " +total);
		}
		for(int j=0; j<arr[0].length; j++){
			int total=0;
			for(int i=0; i<arr.length; i++){
				total += arr[i][j];
			}
			System.out.println("Total number within column " +(j+1)+ " is " +total);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row, column;
		System.out.print("Enter the number of row: ");
		row = sc.nextInt();
		System.out.print("Enter the number of column: ");
		column = sc.nextInt();
		int matrix[][] = new int[row][column];
		inputMatrix(matrix);
		displayMatrix(matrix);
		sumRowColumn(matrix);
	}
}