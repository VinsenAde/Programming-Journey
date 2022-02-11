import java.util.Scanner;
Scanner sc = new Scanner(System.in);
static int faktorialRekursif(int n){
    n = sc.nextInt();
    if (n == 0){
        return (1);
        
    }else {
        return (n * faktorialRekursif(n-i));
    }
}