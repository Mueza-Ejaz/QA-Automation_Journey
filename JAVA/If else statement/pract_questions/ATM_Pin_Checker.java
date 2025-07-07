
import java.util.*;


//Check if the user's PIN is correct, then print “Access Granted”, otherwise “Wrong PIN”.

public class ATM_Pin_Checker {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       //User enter ATM pin number
       System.out.println("Enter correct ATM Pin number______. ");
       int userPin = sc.nextInt();

       //original number
       int originalPin = 86457;

       //if else statement
        if(originalPin == userPin){
            System.out.println("Access Granted");

        }else{
            System.out.println("Access Denied: Wrong Pin ");

        }


        //output: 01
//        Enter correct ATM Pin number______.
//        8457
//        Access Denied: Wrong Pin

        
        //output: 02
//        Enter correct ATM Pin number______.
//        86457
//        Access Granted



    }
}























