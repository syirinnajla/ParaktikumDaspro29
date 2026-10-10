import java.util.Scanner;

 public class Tugas1Pemilihan29{

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("--- Cetak KRS SIAKAD ---");
      System.out.println("Apakah UKT sudah lunas? (true/false): ");
      boolean uktLunas = sc.nextBoolean();
       String msg = (uktLunas) ? ("Pembayaran UKT terverifikasi"): ("Silahkan cari KRS dan minta tanda tangan DPA");
       
      

   }
    
}
