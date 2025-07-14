import java.util.*;

// Make a function to check if a number is prime or not.

public class Prime_Function {
    public static void primeNum(int a){
        boolean isPrime = true;

        if(a <= 1){
            isPrime = false;   // bcz o and 1 not a prime number

        }else{
            for(int i = 2; i < a; i++){
                if(a % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }


        if(isPrime){
            System.out.println("It's a prime number");
        }else{
            System.out.println("It's not a prime number");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        primeNum(a);

        sc.close();

    }
}

// output: 1
//19
//It's a prime number


// output: 2
//15
//It's not a prime number














