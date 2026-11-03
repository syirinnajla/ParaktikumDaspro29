package week6;
import java.util.Scanner;

public class TotalKoinPvZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String mode;
        int jumlahZombie;
        int koinPerZombie = 0;
        int koinDasar;
        int persenBonus = 0;
        int bonus;
        int totalKoin;
        int hadiah = 0;

        // Input mode level
        System.out.print("Mode level (siang/malam): ");
        mode = input.nextLine().trim();

        // Input jumlah zombie
        System.out.print("Jumlah zombie dikalahkan: ");
        jumlahZombie = input.nextInt();

        // Validasi input
        if ((!mode.equalsIgnoreCase("siang")
                && !mode.equalsIgnoreCase("malam"))
                || jumlahZombie < 0) {

            System.out.println(
                "Input tidak valid! Periksa kembali data Anda."
            );

        } else {
            // Menentukan koin per zombie
            if (mode.equalsIgnoreCase("siang")) {
                koinPerZombie = 10;
            } else {
                koinPerZombie = 15;
            }

            // Menghitung koin dasar
            koinDasar = koinPerZombie * jumlahZombie;

            // Menentukan persentase bonus
            if (jumlahZombie <= 10) {
                persenBonus = 0;
            } else if (jumlahZombie <= 25) {
                if (mode.equalsIgnoreCase("siang")) {
                    persenBonus = 10;
                } else {
                    persenBonus = 15;
                }
            } else {
                if (mode.equalsIgnoreCase("siang")) {
                    persenBonus = 25;
                } else {
                    persenBonus = 30;
                }
            }

            // Menghitung bonus
            bonus = koinDasar * persenBonus / 100;

            // Hadiah khusus mode malam
            if (mode.equalsIgnoreCase("malam")
                    && jumlahZombie > 40) {
                hadiah = 100;
            }

            // Menghitung total koin
            totalKoin = koinDasar + bonus + hadiah;

            // Menampilkan hasil
            System.out.println("Koin dasar: " + koinDasar);
            System.out.println("Bonus: " + persenBonus
                    + "% (" + bonus + ")");

            if (hadiah > 0) {
                System.out.println(
                    "Hadiah Trofi Malam: +" + hadiah + " koin"
                );
            }

            System.out.println("Total koin: " + totalKoin);
        }

        input.close();
    }
}

