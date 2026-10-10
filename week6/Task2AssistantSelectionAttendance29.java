import java.util.Scanner;

public class Task2AssistantSelectionAttendance29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isActiveStudent;
        boolean isSanctioned;
        boolean hasProgrammingCertificate;
        int basicProgrammingGrade;
        int interviewScore;

        System.out.print("Is the student active? (true/false): ");
        isActiveStudent = sc.nextBoolean();
        System.out.print("Is the student under academic sanction? (true/false): ");
        isSanctioned = sc.nextBoolean();
        if (isActiveStudent && !isSanctioned) {
            System.out.print("Enter Basic Programming grade: ");
            basicProgrammingGrade = sc.nextInt();
            System.out.print("Does the student have a programming certificate? (true/false): ");
            hasProgrammingCertificate = sc.nextBoolean();
            if (basicProgrammingGrade >= 80 || hasProgrammingCertificate) {
                System.out.print("Enter interview score: ");
                interviewScore = sc.nextInt();
                if (interviewScore >= 75) {
                    System.out.println("Student is accepted as a lab assistant.");
                } else {
                    System.out.println("Student is not accepted: interview score is below 75.");
                }
            } else {
                System.out.println("Student is not eligible: grade is below 80 and no programming certificate.");
            }
            }  else {
            System.out.println("Student is not eligible: inactive status or academic sanction.");
             }
            sc.close();
            }                                                                                                          
}