import java.util.Scanner;
public class newstudentbiography{
	public static void main(String args[]){
		Scanner nim = new Scanner(System.in);
		Scanner name = new Scanner(System.in);
		Scanner departement = new Scanner(System.in);
		Scanner adress = new Scanner(System.in);
		//declarations//
		String nomorInduk;
		String nama;
		String departemen;
		String alamat;
		//initialization//
		System.out.println("Masukkan nim: ");
		nomorInduk = nim.nextLine();
		System.out.println("Masukkan nama: ");
		nama = name.nextLine();
		System.out.println("Masukkan departemen: ");
		departemen = departement.nextLine();
		System.out.println("Masukkan alamat: ");
		alamat = adress.nextLine();
		
		System.out.println("-------------------------------");
		System.out.println("new student biography (2021)");
		System.out.println("-------------------------------");
		System.out.println("NIM         : " + nomorInduk);
		System.out.println("Name        : " + nama);
		System.out.println("Departement : " + departemen);		
		System.out.println("Adress      : " + alamat);
	}
}
		

	

	
