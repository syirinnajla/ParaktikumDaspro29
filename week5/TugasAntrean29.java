import java.util.Scanner;

public class TugasAntrean29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nomor layanan (1-4): ");
        int kodeLayanan = sc.nextInt();
        
        switch (kodeLayanan) {
            case 1:
                System.out.println("Layanan Akademik");
                break;
            case 2:
                System.out.println("Layanan Keuangan");
                break;
            case 3:
                System.out.println("Layanan Kemahasiswaan");
                break;
            case 4:
                System.out.println("Layanan Administrasi Umum");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }
    }
}

