package week9;

import java.util.Scanner;

public class whileloop29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tabungan = 0;
        int uang;
        int hari = 0;

        while (tabungan < 100000) {
            System.out.print("Enter savings: Rp");
            uang = sc.nextInt();

            tabungan += uang;
            hari++;
        }

        System.out.println("Total savings: Rp" + tabungan);
        System.out.println("Total days: " + hari);

        sc.close();
    }
    
}

//Buatlah program Java untuk menghitung total tabungan seseorang.
//  Pengguna diminta memasukkan jumlah uang yang ditabung setiap hari. 
// Program akan terus meminta input selama jumlah tabungan belum mencapai Rp100.000.
//  Jika sudah mencapai atau melebihi target, program menampilkan total 
// tabungan dan jumlah hari yang dibutuhkan.