import java.util.*;

//Electricity Bill Calculator:
//Write a Java program that calculates the electricity bill based on units consumed:

//- First 100 units → Rs. 5/unit
//- Next 100 units (101–200) → Rs. 7/unit
//- Units above 200 → Rs. 10/unit.

//Take total units as input and calculate the total bill.


public class Electricity_Bill_Calculator {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //User enter consumed electricity units
            System.out.print("Please enter the total electricity units you have consumed:");

            int consumedUnits = sc.nextInt();
            int bill = 0;

            //if else statement:
        
            //User enters 250 units
            //   Logic:

            // First 100 units → 100 × 5 = 500
            // Next 100 units → 100 × 7 = 700
            // Remaining 50 units → 50 × 10 = 500
            // Total = 500 + 700 + 500 = Rs. 1700

        
            if(consumedUnits <= 100){
                bill = consumedUnits * 5;

            }else if(consumedUnits <= 200){
                bill = (100 * 5) + (consumedUnits - 100) * 7;

            } else {
                bill = (100 * 5) + (100 * 7) + (consumedUnits - 200) * 10;

            }

        // Final Output
        System.out.println("Your total electricity bill for " + consumedUnits + " units is: Rs. " + bill);


        }
    }


//output: 1
//        Please enter the total electricity units you have consumed:9
//        Your total electricity bill for 9 units is: Rs. 45


//output: 2
//        Please enter the total electricity units you have consumed:400
//        Your total electricity bill for 400 units is: Rs. 3200

