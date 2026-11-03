package week7;
import java.util.Scanner;

public class ParkingAssignment29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type;
        int duration;
        int total = 0;

        while (true) {
            System.out.println("\nEnter vehicle type:");
            System.out.println("1 = Car");
            System.out.println("2 = Motorcycle");
            System.out.println("0 = Exit");
            System.out.print("Choice: ");
            type = sc.nextInt();

            if (type == 0) {
                break;
            }

            if (type != 1 && type != 2) {
                System.out.println("Invalid vehicle type!");
                continue;
            }

            System.out.print("Enter parking duration (hours): ");
            duration = sc.nextInt();

            if (duration < 0) {
                System.out.println("Invalid duration!");
                continue;
            }

            if (type == 1) {
                total += duration * 3000;
            } else {
                total += duration * 2000;
            }
        }

        System.out.println("Total parking fee: Rp " + total);

        sc.close();
    }
}
