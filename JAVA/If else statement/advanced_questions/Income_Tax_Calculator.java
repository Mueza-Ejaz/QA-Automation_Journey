import java.util.*;

//Income Tax Calculator:
//Write a Java program to calculate income tax based on these rules:

//- Income ≤ 250,000 → No Tax
//- 250,001 to 500,000 → 5% on amount above 250,000
//- 500,001 to 1,000,000 → 5% on first 250,000 + 10% on next 500,000
//- Above 1,000,000 → Same as above + 20% on remaining amount

//Input: Annual salary
//Output: Total tax to pay



public class Income_Tax_Calculator {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //User enter annual income
            System.out.print("Enter your annual salary income: ");
            int annualSalary = sc.nextInt();


        // Calculate total tax based on user's annual salary using if-else statements
        if (annualSalary <= 250000) {
            System.out.println("No Tax to pay!");

        }else if(annualSalary <= 500000){
            double tax = (annualSalary - 250000) * 0.05;
            System.out.println("Total tax to pay: Rs." + tax);

        }else if(annualSalary <= 1000000){
            double tax = (250000 * 0.05) + ((annualSalary - 500000) * 0.10);
            System.out.println("Total tax to pay: Rs." + tax);

        }else {
            double tax = (250000 * 0.05) + (500000 * 0.10) + ((annualSalary - 1000000) * 0.20);
            System.out.println("Total tax to pay: Rs." + tax);

        }

    }
}


//output: 

//Enter your annual salary income: 500000
//Total tax to pay: Rs.12500.0
