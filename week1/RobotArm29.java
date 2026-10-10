public class RobotArm29 {
    public static void main(String[] args) {

    String TrayA = "Star ball";
    String TrayB = "Moon ball";
    String TrayC = "Empty";

    // Step 1
    TrayC = TrayA;
    TrayA = "Empty";

    System.out.println("After Step 1:");
    System.out.println("Tray A = " + TrayA);
    System.out.println("Tray B = " + TrayB);
    System.out.println("Tray C = " + TrayC);

    // Step 2
    TrayA = TrayB;
    TrayB = "Empty";

    System.out.println("After Step 2:");
    System.out.println("Tray A = " + TrayA);
    System.out.println("Tray B = " + TrayB);
    System.out.println("Tray C = " + TrayC);

    // Step 3
    TrayB = TrayC;
    TrayC = "Empty";

    System.out.println("After Step 3:");
    System.out.println("Tray A = " + TrayA);
    System.out.println("Tray B = " + TrayB);
    System.out.println("Tray C = " + TrayC);


    System.out.println("Conclusion:");

     // (a) The two balls have switched places
        boolean a = TrayA.equals("Moon ball")
                && TrayB.equals("Star ball");

    // (b) There are two balls in tray A
        boolean b = TrayA.equals("Moon ball" + "Star ball")
                || TrayA.equals("Star ball" + "Moon ball");

    // (c) There are two balls in tray B
        boolean c = TrayB.equals("Moon ball" + "Star ball")
                || TrayB.equals("Star ball" + "Moon ball");

    // (d) Tray A is empty
        boolean d = TrayA.equals("Empty");

    // (e) Tray C is empty
        boolean e = TrayC.equals("Empty");

    // (f) Nothing has changed
        boolean f = TrayA.equals("Star ball")
                && TrayB.equals("Moon ball")
                && TrayC.equals("Empty");

     
        if (a) {
            System.out.println("(a) The two balls have switched places.");
        }

        if (b) {
            System.out.println("(b) There are two balls in tray A.");
        }

        if (c) {
            System.out.println("(c) There are two balls in tray B.");
        }

        if (d) {
            System.out.println("(d) Tray A is empty.");
        }

        if (e) {
            System.out.println("(e) Tray C is empty.");
        }

        if (f) {
            System.out.println("(f) Nothing has changed.");
        }
    }
}
