import java.util.Scanner;

public class NastedLabAccesAttendace299 {
    public class NastedLabAccessAttendace29 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        boolean isActiveStudent = true;
        boolean isSanctioned = false;
        boolean hasLecturerPermit = true;
        boolean isLabAssistant = true;

    if (isActiveStudent && !isSanctioned){
        if (hasLecturerPermit || isLabAssistant) {
            System.out.println("Laboratory access granted");
         } else {
            System.out.println("acces denied: lecturer permission or lab assistant status required");
         }
    }  else {
        System.out.println("Acces denied: student status does not meet the requirement");
        if (isActiveStudent && !isSanctioned && (hasLecturerPermit || isLabAssistant)) {
        System.out.println("Laboratory access granted");
        } else {
        System.out.println("Access denied");
    }
    }  

    }
    
}
}
