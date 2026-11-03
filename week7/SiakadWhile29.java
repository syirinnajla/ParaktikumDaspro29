package week7;
import java.util.Scanner;

public class SiakadWhile29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double score;
        int i = 0;
        int studentCount = 10;

        while (i < studentCount) {
            System.out.print("Enter score for student "
                    + (i + 1) + " (0-100): ");
            score = sc.nextDouble();

            while (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a valid score!");
                System.out.print("Re-enter score for student " + (i + 1) + ": ");
                score = sc.nextDouble();
            }

            if (score > 80) {
                System.out.println("The grade of student " + (i + 1) + " is A");
                System.out.println("Well done, keep up the good work");
            } else if (score > 73) {
                System.out.println("The grade of student " + (i + 1) + " is B+");
            } else if (score > 65) {
                System.out.println("The grade of student " + (i + 1) + " is B");
            } else if (score > 60) {
                System.out.println("The grade of student " + (i + 1) + " is C+");
            } else if (score > 50) {
                System.out.println("The grade of student " + (i + 1) + " is C");
            } else if (score > 39) {
                System.out.println("The grade of student " + (i + 1) + " is D");
            } else {
                System.out.println("The grade of student " + (i + 1) + " is E");
            }

            i++;
        }

        sc.close();
    }
}
