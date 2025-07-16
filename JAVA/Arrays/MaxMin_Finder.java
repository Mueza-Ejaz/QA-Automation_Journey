import java.util.*;

// Find the maximum & minimum number in an array of integers.
//[HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

public class MaxMin_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of array elements:");
        int size = sc.nextInt();

        int [] maxminNum = new int [size];
        System.out.println("Enter array elements:");


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < size; i++) {
            maxminNum[i] = sc.nextInt();

            int num = maxminNum[i];

            if (max < num) {
                max = num;

            }
            if (min > num) {
                min = num;
            }
        }

        System.out.println("Maximum Number is: " + max);
        System.out.println("Minimum number is: " + min);







        sc.close();

    }
}


// output:

//Enter number of array elements:6
//Enter array elements:
//  5
//  78
//  98
//  42
//  4
//  2
//Maximum Number is: 98
//Minimum number is: 2






















