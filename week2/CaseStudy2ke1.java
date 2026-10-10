package week2;

import java.util.Scanner;

public class CaseStudy2ke1 {
    Scanner input = new Scanner(System.in);
    public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter Land Width");
       int landWidth = sc.nextInt();

       System.out.println("Enter Land Length");
       int landLength = sc.nextInt();

       System.out.println("Enter Circle Pool Radius");
       int circlePoolRadius = sc.nextInt();

       System.out.println("Enter Square Pool Side");
       int squarePoolSide = sc.nextInt();

       int landArea = landWidth * landLength;
       double circlePoolArea = 3.14 * circlePoolRadius * circlePoolRadius;
       int squarePoolArea = squarePoolSide * squarePoolSide;
       double remainingLand = landArea - circlePoolArea - squarePoolArea;

       System.out.println("Remaining Land Area: " + remainingLand);

        
    }
}