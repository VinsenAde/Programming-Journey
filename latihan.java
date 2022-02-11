public class latihan {
       public static void main(String[] args) {
            
              // deklarasi variabel
              double panjang = 25;
              double lebar = 10;
              double jumlah;
              double kurang;
              double kali;
              double bagi;
              double modulus;
            
              //proses operasi
              jumlah = panjang + lebar; // operasi Penjumlahan
              kurang = panjang - lebar; // operasi Pengurangan
              kali   = panjang * lebar; // operasi Perkalian
              bagi   = panjang / lebar; // Operasi Pembagian
              modulus = panjang % lebar; //operasi Modulus
            
              //mencetak hasil
              System.out.println("Hasil Penjumlahan    : " + jumlah);
              System.out.println("Hasil Pengurangan    : " + kurang);
              System.out.println("Hasil Perkalian      : " + kali);
              System.out.println("Hasil Pembagian      : " + bagi);
              System.out.println("Hasil Modulus : " + modulus);
       }

}
