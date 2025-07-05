//-------------------------------------Loops -------------------------------------------------//

import java.util.*;

public class Loops {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

         // For Loop Example

        //  for(int i = 1; i < 11; i++ ){

        //     System.out.println("2 * " + i + " = " + (2 * i));

        //  }

         // cli output:

            // 2 * 1 = 2
            // 2 * 2 = 4
            // 2 * 3 = 6
            // 2 * 4 = 8
            // 2 * 5 = 10
            // 2 * 6 = 12
            // 2 * 7 = 14
            // 2 * 8 = 16
            // 2 * 9 = 18
            // 2 * 10 = 20


        // While Loop Example
        
        // int j = 10;

        // while(j > 0) {
        //     System.out.println(j);
        //     j--;
        // }
        
        // cli output:

            // 10
            // 9
            // 8
            // 7
            // 6
            // 5
            // 4
            // 3
            // 2
            // 1


        // Do While Loop Example

        // int i = 0;

        // do{
        //     System.out.println( i);
        //     i++;

        // }while(i < 11);

        // cli output:

            // 0
            // 1
            // 2
            // 3
            // 4
            // 5
            // 6
            // 7
            // 8
            // 9
            // 10

        // Print the sum of first n natural numbers using a for loop.

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            
            sum = sum + i;

        }

        System.out.println(sum); // cli output: 10 if n = 4




    }
}




