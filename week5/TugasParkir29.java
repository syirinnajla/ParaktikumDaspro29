import java.util.Scanner;

public class TugasParkir29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor): ");
        int jenisKendaraan = sc.nextInt();
        System.out.print("Masukkan durasi jam parkir: ");
        int durasi = sc.nextInt();
        
        int totalBiaya = 0;
        
        if (jenisKendaraan == 1) {
            totalBiaya = durasi * 5000;
        } else if (jenisKendaraan == 2) {
            totalBiaya = durasi * 3000;
        } else {
            System.out.println("Kendaraan tidak valid");
            return;
        }
        
        System.out.println("Total biaya parkir: Rp " + totalBiaya);
    }

}
