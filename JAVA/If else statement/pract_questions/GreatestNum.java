
import java.util.*;

//Question : 02
//Take three numbers from the user and find out which one is the greatest.

public class GreatestNum {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       //User enter three numbers
       System.out.println("Enter three numbers:____");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();


        //If else Statement:
        if(x > y & x > z){
            System.out.println("Number" + " " + x + " " + "is the greatest");

        }else if(y > x & y > z){
            System.out.println("Number" + " " + y + " " + "is the greatest");

        }else if(z > x & z > y){
            System.out.println("Number" + " " + z + " " + "is the greatest");

        }else{
            System.out.println("Invalid Input");

        }

        //output:
//        Enter three numbers:____
//        10
//        19
//        20
//        Number 20 is the greatest

    }
}























