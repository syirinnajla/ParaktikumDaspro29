package week7;
import java.util.Scanner;

public class MidExamSyirin29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String day;
        int age;
        int price;
        int discount = 0;
        int addition = 0;
        int total;

        System.out.print("Enter day type (weekday/weekend): ");
        day = input.next();
        System.out.print("Enter viewer age: ");
        age = input.nextInt();

     if (age <= 0 || (!day.equals("weekday") && !day.equals("weekend"))) {
         System.out.println("Invalid input! Please check again.");
        } else {
    if (day.equals("weekday")) {
        price = 40000;
        } else {
        price = 50000;
        }
    if (day.equals("weekday")) {
       if (age <= 12) {
        discount = price * 50 / 100;
    } else if (age >= 60) {
        discount = price * 30 / 100;
        }
    } else {
    if (age <= 12) {
        discount = discount * 30 / 100;
    } else if (age >= 60) {
        discount = price * 10 / 100;
    }

    if (age >= 18 && age <= 25) {
        addition = price * 5 / 100;
        }
    }
        total = price - discount + addition;

        System.out.println("Base price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("addition: " + addition);
        System.out.println("Final ticket price: " + total);
    }
  }
}