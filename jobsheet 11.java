import java.util.Scanner;
class jobsheet11{
	public static void main(String args[]){
		
Scanner sc = new Scanner(System.in);
         double temp[][] = new double[2][3];
         int x,y;
         
         for(x=0;x<temp.length;x++){
			 double max=0;
             for(y=0;y<temp[0].length;y++){
             System.out.print("Enter Temperature city no - " + x + ","+ y +" : ");
             temp[x][y]=sc.nextInt();
			     if(max<temp[x][y]){
                 max=temp[x][y];
				 
				 }
				 
			 }System.out.println("the max temperature city number-"+x+":" +max);
		 }
		 
         
	}
}