
import java.util.Scanner;

public class ProyekAkhirS1 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    static Scanner input = new Scanner(System.in);
    static Scanner input2 = new Scanner(System.in);
    static Scanner input3 = new Scanner(System.in);
    static String studentData1[] = {"Vinsensius Ade Winata", "Batu 9-9-2009", "Student", "1I"};
    static String studentData2[] = {"Ikrar Budi", "Batu 8-8-2008", "Student", "1J"};
    static String studentData3[] = {"Roziq Mahbubi", "Batu 7-7-2007", "Student", "1G"};
    static String teacherData[] = {"Evan Fadhilah", "Batu 17-8-1945", "Teacher", "Informatic Technology"};
    static String subject[] = {"English", "Basic Programming", "Mathematic", "Critical Thinking"};
    static String grade[] = {ANSI_GREEN + "A" + ANSI_RESET, ANSI_YELLOW + "B" + ANSI_RESET, ANSI_BLUE + "C" + ANSI_RESET, ANSI_RED + "D" + ANSI_RESET};
    static String grade2[] = {ANSI_GREEN + "A" + ANSI_RESET, ANSI_YELLOW + "B" + ANSI_RESET, ANSI_BLUE + "C" + ANSI_RESET, ANSI_RED + "D" + ANSI_RESET};
    static String grade3[] = {ANSI_GREEN + "A" + ANSI_RESET, ANSI_YELLOW + "B" + ANSI_RESET, ANSI_BLUE + "C" + ANSI_RESET, ANSI_RED + "D" + ANSI_RESET};
    static int[] score = {0, 0, 0, 0};
    static int avg;
    static int avg2;
    static int avg3;
    static int total = 0;
    static String a;
    static String b;
    static String c;
    

    public static boolean login(String password, int numberOfAttempts, Scanner input3) {
        for (int attempt = 1; attempt <= numberOfAttempts; attempt++) {
            System.out.format("- Please type the LMS password to access - \n", attempt);
            System.out.format("Attempt %d \n", attempt);
            String passwordEntered = input3.nextLine();

            if (passwordEntered.equals(password)) {
                return true;
            } else {
                System.out.println("Wrong password");
            }
        }
        return false;
    }

    private static int average(String[] grade) {
        if (avg >= 80) {
            System.out.println(grade[0]);

        } else if (avg >= 60 && avg < 80) {
            System.out.println(grade[1]);

        } else if (avg >= 40 && avg < 60) {
            System.out.println(grade[2]);

        } else {
            System.out.println(grade[3]);
        }
        return avg;

    }

    private static int average2(String[] grade2) {
        if (avg2 >= 80) {
            System.out.println(grade2[0]);

        } else if (avg2 >= 60 && avg2 < 80) {
            System.out.println(grade2[1]);

        } else if (avg2 >= 40 && avg2 < 60) {
            System.out.println(grade2[2]);

        } else {
            System.out.println(grade2[3]);
        }
        return avg2;

    }

    private static int average3(String[] grade3) {
        if (avg3 >= 80) {
            System.out.println(grade3[0]);

        } else if (avg3 >= 60 && avg3 < 80) {
            System.out.println(grade3[1]);

        } else if (avg3 >= 40 && avg3 < 60) {
            System.out.println(grade3[2]);

        } else {
            System.out.println(grade3[3]);
        }
        return avg3;

    }

    public static int grading1(int score[], String[] grade, int avg) {
        int ss = 0;
 
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Name                              : " + studentData1[0]);
        System.out.println("Place and Birth Date              : " + studentData1[1]);
        System.out.println("Status                            : " + studentData1[2]);
        System.out.println("Class                             : " + studentData2[3]);
        for (int i = 0; i <= 3; i++) {
            System.out.println("Subject " + subject[i] + ":" + score[i]);
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Your grade score is               :");
        System.out.println("Your average score is             : " + average(grade));
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("*Notes : " + a);
        System.out.println("Do you want to change your data? (Y/N)");
        boolean yesno = true;
        while (yesno) {

            String decision = input3.nextLine();

            switch (decision) {
                case "Y":
                    
                    System.out.println("Name                  : ");
                    studentData1[0] = input3.nextLine();
                    System.out.println("Place and Birth Date  : ");
                    studentData1[1] = input3.nextLine();
                    System.out.println("Status                : ");
                    studentData1[2] = input3.nextLine();
                    System.out.println("Class                 : ");
                    studentData1[3] = input3.nextLine();
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Name                  : " + studentData1[0]);
                    System.out.println("Place and Birth Date  : " + studentData1[1]);
                    System.out.println("Status                : " + studentData1[2]);
                    System.out.println("Class                 : " + studentData1[3]);
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your grade score is     :");
                    System.out.println("Your average score is   : " + average(grade));
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("*Notes : " + a);
                    yesno = false;
                    break;
                case "N":
                    System.out.println();
                    yesno = false;

                    break;
                default:
                    System.out.println();
                    yesno = false;
                    break;

            }
        }
        return ss;
    }

    public static int grading2(int score[], String[] grade2, int avg2) {

        int ss = 0;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Name                              : " + studentData2[0]);
        System.out.println("Place and Birth Date              : " + studentData2[1]);
        System.out.println("Status                            : " + studentData2[2]);
        System.out.println("Class                             : " + studentData2[3]);
        for (int i = 0; i <= 3; i++) {
            System.out.println("Subject " + subject[i] + ":" + score[i]);
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Your grade score is               :");
        System.out.println("Your average score is             : " + average2(grade2));
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("*Notes : " + b);
        System.out.println("Do you want to change your data? (Y/N)");
        boolean yesno = true;
        while (yesno) {

            String decision = input3.nextLine();

            switch (decision) {
                case "Y":
                    yesno = false;
                    System.out.println("Name                  : ");
                    studentData2[0] = input3.nextLine();
                    System.out.println("Place and Birth Date  : ");
                    studentData2[1] = input3.nextLine();
                    System.out.println("Status                : ");
                    studentData2[2] = input3.nextLine();
                    System.out.println("Class                 : ");
                    studentData2[3] = input3.nextLine();
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Name                  : " + studentData2[0]);
                    System.out.println("Place and Birth Date  : " + studentData2[1]);
                    System.out.println("Status                : " + studentData2[2]);
                    System.out.println("Class                 : " + studentData2[3]);
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your grade score is     :");
                    System.out.println("Your average score is   : " + average2(grade2));
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("*Notes : " + b);
                    break;
                case "N":
                    System.out.println();
                    yesno = false;

                    break;
                default:
                    System.out.println();
                    yesno = false;

                    break;

            }
        }
        return ss;
    }

    public static int grading3(int score[], String[] grade3, int avg3) {
        System.out.println("--------------------------------------------------------------------------------");
        int ss = 0;

        System.out.println("Name                              : " + studentData3[0]);
        System.out.println("Place and Birth Date              : " + studentData3[1]);
        System.out.println("Status                            : " + studentData3[2]);
        System.out.println("Class                             : " + studentData3[3]);
        for (int i = 0; i <= 3; i++) {
            System.out.println("Subject " + subject[i] + ":" + score[i]);
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Your grade score is               :");
        System.out.println("Your average score is             : " + average3(grade3));
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("*Notes : " + c);
        System.out.println("Do you want to change your data? (Y/N)");
        
        boolean yesno = true;
        while (yesno) {

            String decision = input3.nextLine();

            switch (decision) {
                case "Y":
                    yesno = false;
                    System.out.println("Name                  : ");
                    studentData3[0] = input3.nextLine();
                    System.out.println("Place and Birth Date  : ");
                    studentData3[1] = input3.nextLine();
                    System.out.println("Status                : ");
                    studentData3[2] = input3.nextLine();
                    System.out.println("Class                 : ");
                    studentData3[3] = input3.nextLine();
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Name                  : " + studentData3[0]);
                    System.out.println("Place and Birth Date  : " + studentData3[1]);
                    System.out.println("Status                : " + studentData3[2]);
                    System.out.println("Class                 : " + studentData3[3]);
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your grade score is     :");
                    System.out.println("Your average score is   : " + average3(grade3));
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("*Notes : " + c);
                    break;
                case "N":
                    System.out.println();
                    yesno = false;

                    break;
                default:
                    System.out.println();
                    yesno = false;

                    break;

            }
        }
        return ss;
    }

    public static int calcScore(int total) {


        score = new int[4];
        for (int i = 0; i < subject.length; i++) {
            System.out.print("Enter Score of Subject " + subject[i] + ":");
            score[i] = input2.nextInt();
            total = total + score[i];

            System.out.println(subject[i] + " " + score[i]);

        }

        avg = total / 4;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("The student Score Average is : " + avg);
        System.out.print("The student Grade is: \n");
        average(grade);
        System.out.println("*Notes : ");
        a = input3.nextLine();

        return total;
    }

    public static int calcScore2(int total) {

        score = new int[4];
        for (int i = 0; i < subject.length; i++) {
            System.out.print("Enter Score of Subject " + subject[i] + ":");
            score[i] = input2.nextInt();
            total = total + score[i];

            System.out.println(subject[i] + " " + score[i]);

        }

        avg2 = total / 4;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("The student Score Average is : " + avg2);
        System.out.print("The student Grade is: \n");
        average2(grade2);
        System.out.println("*Notes : ");
        b = input3.nextLine();

        return total;
    }

    public static int calcScore3(int total) {

        score = new int[4];
        for (int i = 0; i < subject.length; i++) {
            System.out.print("Enter Score of Subject " + subject[i] + ":");
            score[i] = input2.nextInt();
            total = total + score[i];

            System.out.println(subject[i] + " " + score[i]);

        }

        avg3 = total / 4;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("The student Score Average is : " + avg3);
        System.out.print("The student Grade is: \n");
        average3(grade3);
        System.out.println("*Notes : ");
        c = input3.nextLine();

        return total;
    }

    public static String studentData1(String a) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Your Student data");
        System.out.println("Name                      : " + studentData1[0]);
        System.out.println("Place and Birth Date      : " + studentData1[1]);
        System.out.println("Status                    : " + studentData1[2]);
        System.out.println("Class                     : " + studentData1[3]);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Student grade score is    :");
        System.out.println("Student average score is  : " + average(grade));
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("*Notes : " + a);
        return a;
    }

    public static String studentData2(String b) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Your Student data");
        System.out.println("Name                      : " + studentData2[0]);
        System.out.println("Place and Birth Date      : " + studentData2[1]);
        System.out.println("Status                    : " + studentData2[2]);
        System.out.println("Class                     : " + studentData2[3]);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Student grade score is    :");
        System.out.println("Student average score is  : " + average2(grade));
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("*Notes : " + b);
        return b;
    }

    public static String studentData3(String c) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Your Student data");
        System.out.println("Name                      : " + studentData3[0]);
        System.out.println("Place and Birth Date      : " + studentData3[1]);
        System.out.println("Status                    : " + studentData3[2]);
        System.out.println("Class                     : " + studentData3[3]);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Student grade score is    :");
        System.out.println("Student average score is  : " + average3(grade));
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("*Notes : " + c);
        return c;
    }

    public static String firstStudent(String a) {
        studentData1(a);
        calcScore(total);
        return a;
    }

    public static String secondStudent(String b) {
        studentData2(b);
        calcScore2(total);
        return b;
    }

    public static String thirdStudent(String c) {
        studentData3(c);
        calcScore3(total);
        return c;
    }

    public static void main(String[] args) {

        String password = "1";
        boolean authenticated = login(password, 3, input); // 3 is number attempt for input
        for (int k = 0; k <= 15; k++) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Welcome to Learning Management System");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Information:\n 1. Insert your ID as a teacher or student. \n "
                    + "2. Students allowed to see their data and change their data. \n "
                    + "3. Students not allowed to change the subject score. \n "
                    + "4. Teachers allowed to access teacher's data and student's data. \n "
                    + "5. Teachers allowed to input student's subject scores and score average will be graded. \n "
                    + "6. Grade score system : \n");
            System.out.println("Score >= 80      : " + grade[0]);
            System.out.println("80 > Score >= 60 : " + grade[1]);
            System.out.println("60 > Score > 40  : " + grade[2]);
            System.out.println("Score < 40       : " + grade[3]);

            if (authenticated) {
                System.out.println("Insert your ID : ");
                String passwordID = input.next();
                String passwordStudent1 = "4";
                String passwordStudent2 = "5";
                String passwordStudent3 = "6";
                String passwordTeacher = "3";
                if (passwordID.equals(passwordStudent1)) {
                    grading1(score, grade, avg);
                }
                if (passwordID.equals(passwordStudent2)) {
                    grading2(score, grade, avg);
                }
                if (passwordID.equals(passwordStudent3)) {
                    grading3(score, grade, avg);

                }
                if (passwordID.equals(passwordTeacher)) {
                     System.out.println("--------------------------------------------------------------------------");

                    System.out.println("Name                      : " + teacherData[0]);
                    System.out.println("Place and Birth Date      : " + teacherData[1]);
                    System.out.println("Status                    : " + teacherData[2]);
                    System.out.println("Major                     : " + teacherData[3]);
                    System.out.println("");
                    System.out.println("Your Student :\n"
                            + " 1. Vinsensius Ade Winata (ID : 4)\n"
                            + " 2. Ikrar Budi (ID : 5)\n"
                            + " 3. Roziq Mahbubi (ID : 6)");
                    System.out.println("Menu : ");
                    System.out.println("1. Input a Student's Score ");
                    System.out.println("2. Input all Student's Score ");
                    System.out.println("3. Print all Student's KHS ");
                    System.out.println("4. Print selected Student's KHS ");
                    System.out.println("5. Exit ");
                     System.out.println("---------------------------------------------------------------------------");
                    

                    boolean yesno = true;
                    while (yesno) {

                        String decision = input3.nextLine();
                        switch (decision) {
                            case "1":
                                yesno = false;
                                System.out.println("To input score please insert the student id number :");
                                passwordID = input.next();
                                if (passwordID.equals(passwordStudent1)) {
                                    firstStudent(a);
                                }
                                if (passwordID.equals(passwordStudent2)) {
                                    secondStudent(a);
                                }
                                if (passwordID.equals(passwordStudent3)) {
                                    thirdStudent(a);
                                }

                                break;
                            case "2":
                                firstStudent(a);
                                secondStudent(a);
                                thirdStudent(a);

                                System.out.println();
                                yesno = false;
                                break;
                            case "3":
                                studentData1(a);
                                studentData2(a);
                                studentData3(a);
                                yesno = false;
                                break;
                            case "4":
                                yesno = false;
                                System.out.println("To print a student's score please insert the student id number :");
                                passwordID = input.next();
                                if (passwordID.equals(passwordStudent1)) {
                                    System.out.println("-------------------------------------------------------------");
                                    studentData1(a);

                                }
                                if (passwordID.equals(passwordStudent2)) {
                                    System.out.println("--------------------------------------------------------------");
                                    studentData2(a);

                                }
                                if (passwordID.equals(passwordStudent3)) {
                                    System.out.println("--------------------------------------------------------------");
                                    studentData3(a);

                                }
                            case "5":
                                System.exit(0);

                            default:
                                System.out.println();
                                break;

                        }

                    }

                }

            }

        }
    }
}
