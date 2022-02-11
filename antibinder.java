import java.util.Scanner;

public class antibinder{
	
	public static void main(String[] args) {
Scanner sc1 = new Scanner(System.in);
Scanner sc2 = new Scanner(System.in);
int age,costL, monthCome, nDependent;
String workStat, studentStat;
System.out.println("Enter your age : ");
age = sc1.nextInt();
if(age >= 18 && age < 100){
System.out.println("Enter your Working
Status (Y/N) : ");
workStat = sc2.nextLine();
if(workStat.equalsIgnoreCase ("Y")){
System.out.println("Enter your Monthly
Income : ");
monthCome = sc1.nextInt();
System.out.println("Total Dependents : ");
nDependent = sc1.nextInt();
costL = monthCome / nDependent;
System.out.println("Your Cost of Living : " +
costL);
if (costL <=300000){
System.out.println("You are poor");
}else{
System.out.println("You are rich");
}
}else if (workStat.equalsIgnoreCase ("N")){
System.out.println("You are poor");
}
}else{
System.out.println("Enter your Student
status (Y/N)");
studentStat = sc2.nextLine();
if (studentStat.equalsIgnoreCase ("Y") ){
System.out.println("You are rich");
}else if(studentStat.equalsIgnoreCase
("N")){
System.out.println("You are poor");
}
}