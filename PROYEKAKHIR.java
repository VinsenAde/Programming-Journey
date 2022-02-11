
import java.util.Scanner;

public class PROYEKAKHIR {

    Scanner input = new Scanner(System.in);

    public static boolean login(String password, int numberOfAttempts, Scanner input) {
        for (int attempt = 1; attempt <= numberOfAttempts; attempt++) {
            System.out.format("Attempt %d - Please type your password: ", attempt);
            String passwordEntered = input.nextLine();
            if (passwordEntered.equals(password)) {
                return true;
            } else {
                System.out.println("wrong password");
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String studentData[] = {"Vinsensius Ade Winata", "Batu 9-9-2009", "Student", "1I"};
        String teacherData[] = {"Evan Fadhilah", "Batu 17-8-1945", "Teacher", "Informatic Technology"};
        String subject[] = {"English", "Basic Programming", "Mathematicr", "Critical Thinking"};
        String password = "1";
        Scanner input = new Scanner(System.in);
        boolean authenticated = login(password, 3, input); // 3 is number attempt for input
        if (authenticated) {
            System.out.println("Insert your ID : ");
            String passwordID = input.next();
            String passwordStudent = "2";
            String passwordTeacher = "3";
            if (passwordID.equals(passwordStudent)) {

                System.out.println("Name : " + studentData[0]);
                System.out.println("Place and Birth Date : " + studentData[1]);
                System.out.println("Status : " + studentData[2]);
                System.out.println("Class : " + studentData[3]);

                System.out.println("Do you want to change your data? (Y/N)");
                boolean yesno = true;
                while (yesno) {

                    String decision = input.nextLine();

                    switch (decision) {
                        case "Y":
                            yesno = false;
                            System.out.println("Name : ");
                            studentData[0] = input.nextLine();
                            System.out.println("Place and Birth Date : ");
                            studentData[1] = input.nextLine();
                            System.out.println("Status : ");
                            studentData[2] = input.nextLine();
                            System.out.println("Class :");
                            studentData[3] = input.nextLine();
                            System.out.print("Name : " + studentData[0]);
                            System.out.print("Place and Birth Date : " + studentData[1]);
                            System.out.print("Status : " + studentData[2]);
                            System.out.print("Class : " + studentData[3]);
                            break;
                        case "N":

                            System.out.println("Name : " + studentData[0]);
                            System.out.println("Place and Birth Date : " + studentData[1]);
                            System.out.println("Status : " + studentData[2]);
                            System.out.println("Class : " + studentData[3]);
                            yesno = true;
                            break;
                        default:

                    }
                }
            }
            if (passwordID.equals(passwordTeacher)) {

                System.out.println("Name : " + teacherData[0]);
                System.out.println("Place and Birth Date : " + teacherData[1]);
                System.out.println("Status : " + teacherData[2]);
                System.out.println("Major : " + teacherData[3]);

                System.out.println("Your Student data :");
                System.out.println("Name : " + studentData[0]);
                System.out.println("Place and Birth Date : " + studentData[1]);
                System.out.println("Status : " + studentData[2]);
                System.out.println("Class : " + studentData[3]);
                int score[] = new int[6];
                int i;
                float total = 0, avg;
                Scanner input2 = new Scanner(System.in);

                for (i = 0; i <= 3; i++) {
                    System.out.print("Enter Score of Subject " + subject[i] + ":");
                    score[i] = input2.nextInt();
                    total = total + score[i];
                }
                avg = total / 6;
                System.out.print("The student Grade is: ");
                if (avg >= 80) {
                    System.out.print("A");
                } else if (avg >= 60 && avg < 80) {
                    System.out.print("B");
                } else if (avg >= 40 && avg < 60) {
                    System.out.print("C");
                } else {
                    System.out.print("D");
                }

            } else {
                System.out.println("Access Denied, enter your correct ID");
            }
        }
    }
}
