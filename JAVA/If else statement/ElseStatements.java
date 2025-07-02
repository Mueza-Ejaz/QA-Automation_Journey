//-------------------------------------conditional statements -------------------------------------------------//

import java.util.*;

public class ElseStatements{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        // if-else statement
        if(age > 18){
            System.out.println("You're an adult.");
        }

        else{
            System.out.println("You're not an adult..");
        }


        // cli output:
            // 16
            // You're not an adult..

//-------------------------------------------------------------------------------------//       


        int a = sc.nextInt();
        int b = sc.nextInt();
        int modulus = a % b;

        // if-else statement:

        if(modulus == 0){
            System.out.println("Number is Divisible by 2");
        } else {
            System.out.println("Not Divisible by 2");
        }
       
          // cli output:
          // 12
          // 4 
          // Number is Divisible by 2



//-------------------------------------------------------------------------------------//


        int x = sc.nextInt();
        int y = sc.nextInt();


        // if-else statement:

        if (x == y){
            System.out.println("Both numbers are equal.");
        } else if (x > y){
            System.out.println("First number is greater than second number.");
        } else if (x < y){
            System.out.println("Second number is greater than first number.");
        } else {
            System.out.println("Invalid input.");
        }


        // cli output:
        // 2
        // 5
        // Second number is greater than first number.


    //---------------------------------- Switch and break ----------------------------------------------------//

        String button = sc.nextLine();

        // switch statement:
        switch (button) {
            case "On":
                System.out.println("The Fan is Start."); 
                break;

            case "Off":
                System.out.println("The Fan is Stop.");
                break;
        
            default:
                System.out.println("Invalid Input.");
                break;
        }

        // cli output:
        // On
        // The Fan is Start.


    }
}




