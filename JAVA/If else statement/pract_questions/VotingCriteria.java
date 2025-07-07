
import java.util.*;

//Question : 03
//Take the user's age as input and check whether the user is eligible to vote (age ≥ 18).

public class VotingCriteria {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       //user enter the age
        System.out.println("Enter your age:___.");
        int age = sc.nextInt();

        //if else statement:
        if(age >= 18){
            System.out.println("Eligible");

        }else{
            System.out.println("Not Eligible");

        }

        //output:

//        Enter your age:___.
//        32
//        Eligible



    }
}























