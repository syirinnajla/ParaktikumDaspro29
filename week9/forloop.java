package week9;

import java.util.Scanner;

public class forloop{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa;
        int nilai;
        int total = 0;
        double rataRata;

        System.out.print("Enter number of students: ");
        jumlahMahasiswa = sc.nextInt();

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Enter score of student " + i + ": ");
            nilai = sc.nextInt();

            total += nilai;
        }

        rataRata = (double) total / jumlahMahasiswa;

        System.out.println("Total score: " + total);
        System.out.println("Average score: " + rataRata);

        sc.close();
    }
}
    //Buatlah program Java untuk memasukkan jumlah mahasiswa. 
    // Kemudian, masukkan nilai setiap mahasiswa menggunakan perulangan for. 
    // Setelah semua nilai dimasukkan, 
    // program harus menampilkan total nilai dan rata-rata nilai mahasiswa.
