//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :

//  1 : + (Addition) a + b
//● 2 : - (Subtraction) a - b
//● 3 : * (Multiplication) a * b
//● 4 : / (Division) a / b
//● 5 : % (Modulo or remainder) a % b
//Calculate the result according to the operation given and display it to the user.

import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //take two numbers from user
        System.out.println("Enter only two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Print operators options:
        System.out.println("\n1- Addition (a + b) ");
        System.out.println("2- Subtraction (a - b) ");
        System.out.println("3- Multiplication (a * b)");
        System.out.println("4- Division (a / b) ");
        System.out.println("5- Modulo or Remainder (a % b) \n");

        //User choose operators:
        System.out.println("Choose operators btw (1 to 5):");
        int opt = sc.nextInt();


        //if else statement:
        if (opt == 1) {
            int sum = a + b;
            System.out.println("The sum of two given numbers" + " " + a + " " + "and" + " " + b + " is " + sum);

        }else if (opt == 2){
            int sub = a - b;
            System.out.println("The difference btw two given numbers" + " " + a + " " + "and" + " " + b + " is " + sub);


        }else if(opt == 3){
            int multiply = a * b;
            System.out.println("Multiplication of  two given numbers" + " " + a + " " + "and" + " " + b + " is " + multiply);

        }else if(opt == 4){
            int divide = a / b;
            System.out.println("Division of  two given numbers" + " " + a + " " + "and" + " " + b + " is " + divide);

        }else{
            int modulo = a % b;
            System.out.println("Modulo/Remainder of  two given numbers" + " " + a + " " + "and" + " " + b + " is " + modulo);
        }


    }
}

