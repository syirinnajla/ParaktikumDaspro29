package week3;

import java.util.Scanner;

public class CaseStudy2 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         
         double x;
         double fuel;
         double fuelPrice = 10000;
         double totalCost;

         System.out.print("Enter the distance from Malang to Surabaya (km):  ");
         x = sc.nextDouble();

        fuel = x / 2;
        totalCost = fuel * fuelPrice;

        System.out.println("Fuel needed " + fuel + "liter" );
        System.out.println("Total fuel cos: Rp " + (int) totalCost);

    }
    
}
