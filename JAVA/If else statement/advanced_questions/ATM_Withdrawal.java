import java.util.*;

//ATM Withdrawal Logic:
//Create a Java program to simulate ATM withdrawal.

//User enters amount to withdraw;
//Conditions:

//- Amount must be multiple of 500
//- Account balance must be ≥ amount + Rs. 10 (transaction fee)
//- If conditions are valid, deduct amount + fee
//- Else show appropriate error


public class ATM_Withdrawal {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //User enter annual income
            System.out.print("Enter amount to withdrawal: ");
            int withdrawalAmount = sc.nextInt();

            int total_balance = 2000;


        // Calculate total tax based on user's annual salary using if-else statements
        if (withdrawalAmount % 500 != 0 ) {
            System.out.println("Invalid amount! Please enter in multiples of 500.");

        }else if(total_balance < withdrawalAmount + 10){
            System.out.println("Insufficient balance! You must have at least Rs."  + (withdrawalAmount + 10));

        }else {
            total_balance = total_balance - (withdrawalAmount + 10);
            System.out.println("Transaction successful!");
            System.out.println("Withdrawn amount: Rs. " + withdrawalAmount);
            System.out.println("Transaction fee: Rs. " + 10);
            System.out.println("Remaining balance: Rs. " + total_balance);
        }

        sc.close();

    }
}


//output:

//Enter amount to withdrawal: 1500
//Transaction successful!
//Withdrawn amount: Rs. 1500
//Transaction fee: Rs. 10
//Remaining balance: Rs. 490


