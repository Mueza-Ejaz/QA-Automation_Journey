import java.util.*;

// Write a function to print the sum of all odd numbers from 1 to n.

public class OddNum_Function {
    public static void odd_NumSum (int n){

        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                System.out.println(i);

                //sum of all odd numbers
                sum += i;

            }

        }
        System.out.println("Sum of all odd numbers: " + sum);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        odd_NumSum(n);

        sc.close();

    }
}

// output:

// 8
// 1
// 3
// 5
// 7
//Sum of all odd numbers: 16















