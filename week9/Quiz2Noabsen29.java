package week9;

import java.util.Scanner;

public class Quiz2Noabsen29 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
        int suhu;
        int totalsuhu = 0;
        int suhustabil = 0;
        int suhuterpanas = 0;
        int jumlahsuhu;
        int jumlahsuhu1;
        String nama = "Syirin najla"; 
        int noAbsen = 29;
        int k = noAbsen % 0;

        System.out.println("Nama ; " + nama);
        System.out.println("Kode personal K = " + k);
    


    System.out.print("jumlah rak : ");
    int jumlahrak = sc.nextInt();

        if (jumlahrak <= 0) {
            System.out.println("rak");
        } else {
            int rak = 1;
            double rakterpanas = -1;
            int jumlahrakkritis = 0;

            while (rak <= jumlahrak) {
                System.out.println("jumlahrak " + rak);
                double totalrak = 0;

                for (int j = 1; j <= jumlahrak; j++) {

                    do {
                        System.out.print(" suhu " + j + ": ");
                        suhu = sc.nextInt();

                        if (suhu > -1 || suhu < 100) {
                          
                        }
                    } while (suhu < -1 || suhu > 100);

                    totalsuhu += suhu;
                
                }

                double ratarata = totalsuhu / rak;

                System.out.println("suhu " + totalsuhu+ ": ratarata = " + ratarata);
                
                if (totalsuhu > jumlahrak) {
                    rakterpanas = suhuterpanas;
                    rakterpanas = rak;
                }

                rak++;
            }
        

        System.out.println("==============================");
        System.out.println("rak terpanas : " + rakterpanas);
        System.out.println("rata rata tertinggi : " + suhuterpanas);
        System.out.println("jumlah rak krisis :" + suhustabil);
      

    }

        sc.close();
    }
}


