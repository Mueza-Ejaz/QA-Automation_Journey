import java.util.*;

//Qs. Print if a number is prime or not (Input n from the user).
//[In this problem you will learn how to check if a number is prime or not].


public class Prime_Number {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //user enter a number
            System.out.print("Enter a number:");
            int n = sc.nextInt();

            boolean isPrime = (n % 2 != 0);


        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}


//output: 1

//Enter a number:7
//Prime


//output: 2

//Enter a number:8
// Not Prime







