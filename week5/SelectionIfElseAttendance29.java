import java.util.Scanner;

public class SelectionIfElseAttendance29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD");
        System.out.println("Masukkan semester saat ini");
        int Semester = sc.nextInt();

        if (Semester == 1) {
            System.out.println("KRS Semester 1 ditampilkan");
        } else if (Semester == 2) {
            System.out.println("KRS Semester 2 ditampilkan");
        } else if (Semester == 3) {
            System.out.println("KRS Semester 3 ditampilkan");
        } else if (Semester == 4) {
            System.out.println("KRS Semester 4 ditampilkan");
        } else if (Semester == 5) {
            System.out.println("KRS Semester 5 ditampilkan");
        } else if (Semester == 6) {
            System.out.println("KRS Semester 6 ditampilkan");
        } else if (Semester == 7) {
            System.out.println("KRS Semester 7 ditampilkan");
        } else if (Semester == 8) {
            System.out.println("KRS Semester 8 ditampilkan");
        } 

        sc.close();
    }
}