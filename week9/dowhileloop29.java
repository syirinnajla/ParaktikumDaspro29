package week9;

import java.util.Scanner;

public class dowhileloop29 {
     public static void main(String[] args) {
         
    Scanner sc = new Scanner(System.in);

        int pilihan;
        int jumlah;
        int total = 0;

        do {
            System.out.println("\n=== FOOD MENU ===");
            System.out.println("1. Fried Rice - Rp15000");
            System.out.println("2. Fried Noodles - Rp12000");
            System.out.println("3. Grilled Chicken - Rp20000");
            System.out.println("0. Exit");

            System.out.print("Choose menu: ");
            pilihan = sc.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Enter quantity: ");
                jumlah = sc.nextInt();

                if (pilihan == 1) {
                    total += 15000 * jumlah;
                } else if (pilihan == 2) {
                    total += 12000 * jumlah;
                } else {
                    total += 20000 * jumlah;
                }
            } else if (pilihan != 0) {
                System.out.println("Invalid menu!");
            }

        } while (pilihan != 0);

        System.out.println("\nTotal payment: Rp" + total);
        System.out.println("Thank you!");

        sc.close();
    }

}

//Buatlah program Java yang menampilkan menu makanan. 
// Pengguna dapat memilih makanan dan memasukkan jumlah pesanan. 
// Program akan terus menampilkan menu selama pengguna belum memilih angka 0 (Exit). 
// Setelah pengguna memilih Exit, tampilkan total harga seluruh pesanan.

//Ketentuan harga:
//- Nasi Goreng = Rp15.000
//- Mie Goreng = Rp12.000
//- Ayam Bakar = Rp20.000
//- Exit = 0

