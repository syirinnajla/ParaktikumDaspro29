import java.util.Scanner;

public class ERAssignmentAttendance29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Alokasi Ruang ER Harapan Kita ---");
        
        System.out.print("Masukkan nilai saturasi oksigen (SpO2 %): ");
        double spO2 = sc.nextDouble();

        System.out.print("Masukkan sisa bed ICU (angka): ");
        int sisaBedICU = sc.nextInt();

        System.out.print("Masukkan tekanan darah sistolik (mmHg): ");
        double systolicBP = sc.nextDouble();

        System.out.print("Apakah pasien sadar sepenuhnya? (true/false): ");
        boolean isFullyConscious = sc.nextBoolean();

        System.out.print("Masukkan suhu tubuh (°C): ");
        double bodyTemp = sc.nextDouble();

        System.out.print("Apakah pasien memiliki komorbid? (true/false): ");
        boolean hasComorbidities = sc.nextBoolean();

        System.out.print("Masukkan usia pasien (tahun): ");
        int age = sc.nextInt();

        System.out.print("Masukkan laju pernapasan (breaths/min): ");
        int respiratoryRate = sc.nextInt();

        String destinationRoom = "";

        if (spO2 < 85 && sisaBedICU > 0) {
            destinationRoom = "ICU";
        } else if (spO2 < 85 && sisaBedICU == 0) {
            destinationRoom = "UGD_VENTILATOR_MOBIL";
        } else if ((spO2 >= 85 && spO2 <= 89) || (systolicBP < 90 || systolicBP > 180) || !isFullyConscious) {
            destinationRoom = "RESUSITASI_UGD";
        } else if (((spO2 >= 90 && spO2 <= 94) || bodyTemp > 39) && hasComorbidities && age >= 65) {
            destinationRoom = "HCU_ISOLASI";
        } else if ((spO2 >= 90 && spO2 <= 94) || respiratoryRate > 24) {
            destinationRoom = "RAWAT_INAP_UMUM";
        } else {
            destinationRoom = "RAWAT_JALAN";
        }
        System.out.println("\n----------------------------------------");
        System.out.println("Hasil Alokasi Ruangan Pasien: " + destinationRoom);
        System.out.println("----------------------------------------");

        sc.close();
    }
}