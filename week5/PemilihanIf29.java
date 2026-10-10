import java.util.Scanner;

public class PemilihanIf29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah sudah bayar UKT? (true/false): ");
        Boolean status = scanner.nextBoolean();

    //     if (status) {
    //         System.out.println("Registration successful.");
    //         System.out.println("Welcome to the semester!");
    //     } else {
    //         System.out.println("Registration rejected. Please pay your UKT first.");
        
    //   } 
    String hello = (status) ?  "Registration successful.\nWelcome to the semester!" : 
     "Registration rejected. Please pay your UKT first.";
    System.out.println(hello);
    }
  }

