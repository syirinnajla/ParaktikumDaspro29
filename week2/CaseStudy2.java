package week2;
import java.util.Scanner;

public class CaseStudy2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int landWidth = 50;
        int landLength = 100;
        int circlePoolRadius = 2;
        int squarePoolSide = 2;

        int landArea = landWidth * landLength;
        double circlePoolArea = 3.14 * circlePoolRadius * circlePoolRadius;
        int squarePoolArea = squarePoolSide * squarePoolSide;
        double remainingLand = landArea - circlePoolArea - squarePoolArea;

        System.out.println("Remaining Land Area: " + remainingLand);

        
    }
}
