import java.util.*;

// Find the factorial of a number.

public class Calculate_Factorial {
    public static void printFactorial(int n){

        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }

        int factorial = 1;

        //loop
        for(int i = n; i >= 1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print("The factorial of a number is: ");
        printFactorial(n);


        sc.close();

    }
}

// cli output

// 3
// The factorial of a number is: 6

















