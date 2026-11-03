package week8;
import java.util.Scanner;
public class Task3Student29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stores: ");
        int numStores = sc.nextInt();

        while (numStores < 1) {
            System.out.println("Number of stores must be at least 1.");
            System.out.print("Enter the number of stores: ");
            numStores = sc.nextInt();
        }

        int totalCustomersAllStores = 0;
        int totalItemsAllStores = 0;
        int bestStore = 1;
        int highestItems = -1;

        for (int i = 1; i <= numStores; i++) {
            System.out.print("Enter number of customers for Store "
                    + i + ": ");
            int numCustomers = sc.nextInt();

            while (numCustomers < 0) {
                System.out.println("Customers cannot be negative.");
                System.out.print("Enter number of customers for Store "
                        + i + ": ");
                numCustomers = sc.nextInt();
            }
            int totalItemsStore = 0;
            for (int j = 1; j <= numCustomers; j++) {
                System.out.print("Enter items bought by customer "
                        + j + " at Store " + i + ": ");
                int items = sc.nextInt();
                while (items < 0) {
                    System.out.println("Items cannot be negative.");
                    System.out.print("Re-enter items for customer "
                            + j + ": ");
                    items = sc.nextInt();
                }
                totalItemsStore += items;
            }
            System.out.println("Store " + i + " - customers: " + numCustomers + ", total items: " + totalItemsStore);
            totalCustomersAllStores += numCustomers;
            totalItemsAllStores += totalItemsStore;
            if (totalItemsStore > highestItems) {
                highestItems = totalItemsStore;
                bestStore = i;
            }
        }
        System.out.println("Total customers across all stores: " + totalCustomersAllStores);
        System.out.println("Total items across all stores: " + totalItemsAllStores);
        System.out.println("Store with the most items: " + bestStore);
        sc.close();
    }
}

