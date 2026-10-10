package week2;
import java.util.Scanner;

public class Bank29 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int init_sav_amount, sav_period;
       double final_sav_amount, interest, interest_percent = 0.02;
       System.out.print("Input your initial savings amount:");
       init_sav_amount = sc.nextInt();
       System.out.print("Input the savings period (in years):");
       sav_period = sc.nextInt();
       interest = init_sav_amount * interest_percent * sav_period;
       final_sav_amount = init_sav_amount + interest;
       System.out.println("Your final savings amount is: " + final_sav_amount);
       
    }
}
