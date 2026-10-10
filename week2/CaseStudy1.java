package week2;

import java.util.Scanner;

public class CaseStudy1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int basic_Salary, children_allowance = 150000;
        float pension_fund = 0.05f;
        int total_allowance, num_children;
        double net_Salary, pension_amount;

        System.out.println("insert your basic salary:");
        basic_Salary = Scanner.nextInt();
        System.out.println("insert number of children:");
        num_children = Scanner.nextInt();

        total_allowance = num_children * children_allowance;
        pension_amount = basic_Salary * pension_fund;
        net_Salary = basic_Salary + total_allowance - pension_amount;

        System.out.println("Your net salary is: " + net_Salary);

        Scanner.close();
    }
}
