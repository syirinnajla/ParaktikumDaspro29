package wri;
import java.util.Scanner;

public class day2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai");
        int nilai = sc.nextInt();
    
        if (nilai > 80 && nilai <= 100){
            System.out.println("Nilai A");
        
        }else if (nilai > 60 && nilai <= 79){
            System.out.println("Nilai B");
         }else{ 
            System.out.println("Nilai C");
         }
    }
}
