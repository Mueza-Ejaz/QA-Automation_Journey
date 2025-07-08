import java.util.*;

//1. Even, Odd, or Zero
//Write a Java program that takes a number from the user and checks:

//- If the number is 0, print "Zero".
//- If the number is even, print "Even Number".
//- If the number is odd, print "Odd Number".

public class Even_Odd_Zero {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //User enter number
            System.out.println("Enter a number____.");
            int num = sc.nextInt();

            //if else statement

        if(num == 0){
            System.out.println("Given Number is Zero");

        }else if(num % 2 == 0){
            System.out.println("The Number is Even");

        } else if (num % 2 == 1) {
            System.out.println("The Number is Odd");

        }else{
            System.out.println("Invalid Input");

        }

        //output: 1
//        Enter a number____.
//        69
//        The Number is Odd


        //output: 2
//        Enter a number____.
//        54
//        The Number is Even


        }
    }
