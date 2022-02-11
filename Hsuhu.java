public class Hsuhu {

  public static void main (String[] args) {

    int lamaMembacaTono, lamaMembacaTini, ongkosBayarTono, ongkosBayarTini, ongkosTotalBayar;
    int jamTono = 8;
    int menitTono = 0;
    int jamTini = 7;
    int menitTini = 0;
    int jamSelesai = 12;
    int menitSelesai = 0;
    int menitPerJam = 60;
    float tarifPerMenit = 20;

    lamaMembacaTono = (jamSelesai - jamTono) * menitPerJam;
    ongkosBayarTono = lamaMembacaTono * tarifPerMenit;
    lamaMembacaTini = (jamSelesai - jamTini) * menitPerJam;
    ongkosBayarTini = lamaMembacaTini * tarifPerMenit;
    ongkosTotalBayar = ongkosBayarTono + ongkosBayarTini;

System.out.println("------------------------------------------");
    System.out.println(" Menghitung lama dan biaya ");
System.out.println("------------------------------------------\n");
    System.out.println(String.format("Tono mulai jam     :%s ", jamTono));
    System.out.println(String.format("Tono mulai menit   :%s ", menitTono));
    System.out.println(String.format("Tini mulai jam\t   :%s ", jamTini));
    System.out.println(String.format("Tini mulai menit   :%s ", menitTini));
    System.out.println(String.format("Jam Selesai        :%s ", jamSelesai));
    System.out.println(String.format("Menit Selesai\t   :%s ", menitSelesai));
    System.out.println(String.format("Lama membaca Tono  %s Jam %s Menit", lamaMembacaTono, menit));
    System.out.println(String.format("Lama Membaca Tini  %s Jam %s Menit", lamaMembacaTini, menit));
    System.out.println(String.format("Ongkos bayar Tono  Rp.%s ", ongkosBayarTono));
    System.out.println(String.format("Ongkos Bayar Tini  Rp.%s ", ongkosBayarTini));
    System.out.println(String.format("Ongkos Total Bayar Rp.%s ", ongkosTotalBayar));

  }
}
