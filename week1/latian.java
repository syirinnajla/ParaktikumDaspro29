public class latian{
    public static void main(String[] args) {
        String NampanA = "Bola Bulan";
        String NampanB = "Bola Bintang";
        String NampanC = "Kosong";

        NampanC = NampanA;
        NampanA = "Kosong";

        System.out.print("Setelah Langkah 1 ");
        System.out.print("Nampan A: " + NampanA + " ");
        System.out.print("Nampan B: " + NampanB + " ");
        System.out.print("Nampan C"+ NampanC + " ");


        NampanB = NampanA;
        NampanB = "Kosong";

        System.out.print("Setelah Langkah 2 ");
        System.out.print("Nampan A: " + NampanA + " ");
        System.out.print("Nampan B: " + NampanB + " ");
        System.out.print("Nampan C"+ NampanC + " ");


        NampanB = NampanC;
        NampanC = "Kosong";

        System.out.print("Setelah Langkah 2 ");
        System.out.print("Nampan A: " + NampanA + " ");
        System.out.print("Nampan B: " + NampanB + " ");
        System.out.print("Nampan C"+ NampanC + " ");

    


        

    }
}