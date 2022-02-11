import java.util.Scanner;
public class QUIZBP{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int matrixA[][] = new int[6][5];
		int total = 0;
		int[] grades = new int[101];
		int scoreTotal = matrixA;
		int temp = 0;

		
		System.out.println("Input your student score!");
		for(int i=0; i<matrixA.length; i++){
			for(int j=0; j<matrixA[0].length; j++){
				System.out.printf("Input the value of student score [%d][%d]: ", i, j);
				matrixA[i][j] = sc.nextInt();
			}
		}
	
for (int rate[] : matrixA) {
	for (int i : rate) {

	System.out.print(i + " ");
	}
	System.out.println();
}
	System.out.println("Task score = 30%");
    System.out.println("Quiz Score = 20%");
	System.out.println("Midterm score = 25%");
	System.out.println("Finalexam Score = 25%");

                if (scoreTotal >= 81){
                System.out.println("Score A");
                }
				else if(scoreTotal < 81){
                System.out.println("Score B");
                }
				else if(scoreTotal < 61){
                System.out.println("Score C");
                }
				else if(scoreTotal < 41){
                System.out.println("Score D");
                }
				else if(scoreTotal < 21){
                System.out.println("Score E");
				
                }
		for(int i=0; i<matrixA.length; i++){
			for(int j=0; j<matrixA[0].length; j++){
if (matrixA[j-1]>matrixA[j]);
	temp = matrixA[j-1];
   matrixA[j-1]= matrixA[j];
   matrixA[j]= temp;
   
            }
}
	}
}