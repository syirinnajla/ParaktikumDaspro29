
import java.util.Scanner;

public class SiakadFor29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double score;
        double highest = 0;
        double lowest = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("enter the student's score " + i + ": ");
            score = sc.nextDouble();

            if (score > highest) {
                highest = score;
            }

            if (score < lowest) {
                lowest = score;
            }
        }

        System.out.println("\nscore highest: " + highest);
        System.out.println("score lowest: " + lowest);

        sc.close();
    }
}
