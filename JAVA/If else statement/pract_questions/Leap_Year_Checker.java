import java.util.*;

// Leap Year Checker
//Write a program that takes a year as input and checks whether it is a leap year or not.

// A year is a leap year if:
//     - It is divisible by 4 and Not divisible by 100 unless it is also divisible by 400.


public class Leap_Year_Checker {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //User enter number
            System.out.print("Enter a Leap Year____.");
            int leapNum = sc.nextInt();

            //if else statement
            if(leapNum % 4 == 0){
                System.out.println("Leap Year! ");

            }else if(leapNum % 400 ==0){
                System.out.println("Leap Year");

            }else{
                System.out.println("Not a Leap Year");

            }




        //output: 1
//        Enter a Leap Year____.2000
//        Leap Year!



        //output: 2
//        Enter a Leap Year____.2005
//        Not a Leap Year




        }
    }
