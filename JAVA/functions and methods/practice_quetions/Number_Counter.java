import java.util.*;

//Write a program to enter the numbers till the user wants and at the end it should display the count of
// positive, negative and zeros entered.


public class Number_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // counters
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zerosCounter = 0;

        int choice;

        do {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n > 0) {
                positiveCounter++;

            } else if (n < 0) {
                negativeCounter++;

            } else {
                zerosCounter++;

            }

            System.out.print("Type 1 to continue or 0 to stop: ");
            choice = sc.nextInt();

        }while(choice == 1);

            System.out.println("\nFinal Count:");

            System.out.println("Positives: " + positiveCounter);
            System.out.println("Negatives: " + negativeCounter);
            System.out.println("Zeros: " + zerosCounter);



        sc.close();

    }
}


// output:

//Enter a number: 4
//Type 1 to continue or 0 to stop: 1
//Enter a number: -5
//Type 1 to continue or 0 to stop: 1
//Enter a number: 0
//Type 1 to continue or 0 to stop: 0


//Final Count:
//Positives: 1
//Negatives: 1
//Zeros: 1
















