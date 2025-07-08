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

            //if else statement
            if(consumedUnits <= 100){
                System.out.println("Your total electricity bill of" + " " + consumedUnits + " " + "units = " + consumedUnits * 5);

            }else if(consumedUnits <= 200){
                System.out.println("Your total electricity bill of" + " " + consumedUnits + " " + "units = " + consumedUnits * 7);

            } else {
                System.out.println("Your total electricity bill of" + " " + consumedUnits + " " + "units = " + consumedUnits * 10);

            }


        //output: 1
//        Please enter the total electricity units you have consumed:9
//        Your total electricity bill of 9 units = 45


        //output: 2
//        Please enter the total electricity units you have consumed:400
//        Your total electricity bill of 400 units = 4000



        }
    }
