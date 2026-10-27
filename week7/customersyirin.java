package week7;

public class customersyirin {
    public static void main(String[] args) {
       do {

    
            System.out.print("Enter customer name (type 'cancel' to exit): ");
                customersyirin = sc.nextLine();
        if (customersyirin.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
            break;
        }
            System.out.print("Coffee quantity: ");
                coffee = sc.nextInt();
            System.out.print("Tea quantity: ");
                tea = sc.nextInt();
            System.out.print("Bread quantity: ");
                bread = sc.nextInt();
            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);
            
        System.out.println("Total amount to pay: Rp " + totalPrice);
                sc.nextLine();
        } while (true);
        System.out.println("All transactions completed.");

     }
    }
