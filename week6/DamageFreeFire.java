
import java.util.Scanner;

public class DamageFreeFire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String senjata;
        String bagian;
        int damageDasar = 0;
        int pengurangan = 0;
        int damageAkhir = 0;
        int persen = 0;

        System.out.print("Senjata (AR/SMG/Sniper): ");
        senjata = input.nextLine();

        System.out.print("Bagian tubuh (kepala/badan): ");
        bagian = input.nextLine();

        // Memeriksa apakah input valid
        boolean senjataValid =
                senjata.equalsIgnoreCase("AR")
                || senjata.equalsIgnoreCase("SMG")
                || senjata.equalsIgnoreCase("Sniper");

        boolean bagianValid =
                bagian.equalsIgnoreCase("kepala")
                || bagian.equalsIgnoreCase("badan");

        if (!senjataValid || !bagianValid) {
            System.out.println(
                "Input tidak valid. Pastikan senjata = "
                + "(AR/SMG/Sniper) dan bagian = (kepala/badan)."
            );
        } else if (senjata.equalsIgnoreCase("Sniper")
                && bagian.equalsIgnoreCase("kepala")) {

            System.out.println(
                "HEADSHOT! Musuh langsung knock."
            );

        } else {
            // Menentukan damage dasar
            if (senjata.equalsIgnoreCase("AR")) {
                if (bagian.equalsIgnoreCase("kepala")) {
                    damageDasar = 60;
                } else {
                    damageDasar = 35;
                }
            } else if (senjata.equalsIgnoreCase("SMG")) {
                if (bagian.equalsIgnoreCase("kepala")) {
                    damageDasar = 45;
                } else {
                    damageDasar = 25;
                }
            } else if (senjata.equalsIgnoreCase("Sniper")) {
                damageDasar = 90;
            }

            // Menghitung pengurangan rompi level 2
            if (senjata.equalsIgnoreCase("AR")
                    && bagian.equalsIgnoreCase("badan")) {
                persen = 20;
            } else if (senjata.equalsIgnoreCase("SMG")) {
                persen = 30;
            }

            pengurangan = damageDasar * persen / 100;
            damageAkhir = damageDasar - pengurangan;

            System.out.println("Damage dasar: " + damageDasar);
            System.out.println("Pengurangan rompi: "
                    + persen + "% (" + pengurangan + ")");
            System.out.println("Damage akhir: " + damageAkhir);
        }

        input.close();
    }
}

 