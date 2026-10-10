package week3;
import java.util.Scanner;

   public class CaseStudy1 {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x ; // x=price motorcycle;
        int y ; // y=down payment;
        int z ; //z= tenor;
        double remainingPrice,monthlyInstallment;
        double interest = 0.01;
        
        
        System.out.println("price motorcycle");
        x = sc.nextInt();
        System.out.println("down payment");
        y = sc.nextInt();
        System.out.println("masukkan tenor (mounth)");
        z = sc.nextInt();

        remainingPrice = x - y;
        monthlyInstallment = (remainingPrice/z)+(remainingPrice*interest);
        System.out.println("monthly installment: " + (int) monthlyInstallment);

        sc.close();
    
    }
    
}
