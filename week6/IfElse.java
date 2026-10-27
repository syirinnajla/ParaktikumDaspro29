import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String level;
        int jumlahMonster;
        int poinPerMonster;
        int poinDasar;
        int bonusPersen;
        int poinBonus;
        int hadiahKhusus = 0;
        int totalPoin;

        System.out.print("Masukkan jenis level (mudah/sulit): ");
        level = input.nextLine();

        System.out.print("Masukkan jumlah monster yang dikalahkan: ");
        if (!input.hasNextInt()) {
            System.out.println(
                "Input tidak valid! Periksa kembali data Anda."
            );
            input.close();
            return;
        }

        jumlahMonster = input.nextInt();

        // Validasi input
        if ((!level.equals("mudah") && !level.equals("sulit"))
                || jumlahMonster < 0) {
            System.out.println(
                "Input tidak valid! Periksa kembali data Anda."
            );
            input.close();
            return;
        }

        // Menentukan poin per monster
        if (level.equals("mudah")) {
            poinPerMonster = 10;
        } else {
            poinPerMonster = 20;
        }

        // Menghitung poin dasar
        poinDasar = poinPerMonster * jumlahMonster;

        // Menentukan bonus berdasarkan level
        if (jumlahMonster <= 5) {
            bonusPersen = 0;
        } else if (jumlahMonster <= 15) {
            if (level.equals("mudah")) {
                bonusPersen = 10;
            } else {
                bonusPersen = 15;
            }
        } else {
            if (level.equals("mudah")) {
                bonusPersen = 20;
            } else {
                bonusPersen = 30;
            }
        }

        // Menghitung poin bonus
        poinBonus = poinDasar * bonusPersen / 100;

        // Menentukan hadiah khusus
        if (level.equals("sulit") && jumlahMonster > 25) {
            hadiahKhusus = 100;
        }

        // Menghitung total poin
        totalPoin = poinDasar + poinBonus + hadiahKhusus;

        // Menampilkan hasil
        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Level: " + level);
        System.out.println("Jumlah monster: " + jumlahMonster);
        System.out.println("Poin dasar: " + poinDasar);
        System.out.println("Bonus: " + bonusPersen
                + "% (" + poinBonus + " poin)");
        System.out.println("Hadiah khusus: " + hadiahKhusus + " poin");
        System.out.println("Total poin: " + totalPoin);

        input.close();
    }
}
//Menghitung Poin dalam Game Petualangan
//Deskripsi Soal
//Dalam sebuah game petualangan, pemain mendapatkan poin setelah berhasil mengalahkan monster. Buatlah program Java untuk menghitung total poin yang diperoleh pemain berdasarkan jenis level dan jumlah monster yang dikalahkan.

//Poin per Monster:
//Jenis Level	Poin per Monster
//Mudah	10
//Sulit	20


//Ketentuan Program
//1. Input yang diminta:
//- Jenis level (mudah atau sulit).
//- Jumlah monster yang dikalahkan (bilangan bulat).
//2. Menghitung poin dasar:

//Poin dasar = Poin per monster × Jumlah monster yang dikalahkan.

//3. Aturan bonus:

//Level Mudah:
//- Monster ≤ 5: tidak mendapatkan bonus.
//- Monster 6–15: mendapatkan bonus 10%.
//- Monster ≥ 16: mendapatkan bonus 20%.
//Level Sulit:
//- Monster ≤ 5: tidak mendapatkan bonus.
//- Monster 6–15: mendapatkan bonus 15%.
//- Monster ≥ 16: mendapatkan bonus 30%.
//- Jika monster yang dikalahkan lebih dari 25, pemain mendapatkan hadiah khusus berupa bonus tambahan 100 poin.
//4. Validasi input:

//Jika jenis level bukan mudah atau sulit, atau jumlah monster kurang dari 0, tampilkan pesan:

//Input tidak valid! Periksa kembali data Anda.

//5. Output program:

//Program menampilkan:
//- Jenis level.
//- Jumlah monster yang dikalahkan.
//- Poin dasar.
//- Persentase bonus.
//- Jumlah poin bonus.
//- Bonus hadiah khusus, jika ada.
//- Total poin yang diperoleh.
