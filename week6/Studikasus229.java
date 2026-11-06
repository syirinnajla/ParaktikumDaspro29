package week6;


import java.util.Scanner;

public class Studikasus229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPKM;
        int kurang;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine().trim().toUpperCase();

        if (jenisKegiatan.equals("BELMAWA") ||
            jenisKegiatan.equals("BAKORMA") ||
            jenisKegiatan.equals("MANDIRI")) {

            System.out.print("Peringkat juara : ");
            peringkatJuara = sc.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {

                System.out.print("Jumlah dokumen : ");
                jumlahDokumen = sc.nextInt();

                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (Juara " + peringkatJuara + ").");
                } else {
                    kurang = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1, 2, atau 3).");
            }

        } else if (jenisKegiatan.equals("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPKM = sc.nextInt();

            if (statusPKM == 1) {

                System.out.print("Jumlah dokumen : ");
                jumlahDokumen = sc.nextInt();

                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    kurang = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }

        } else if (jenisKegiatan.equals("LAINNYA")) {

            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");

        } else {
            System.out.println("Jenis kegiatan tidak valid.");
        }

        sc.close();
    }
}

