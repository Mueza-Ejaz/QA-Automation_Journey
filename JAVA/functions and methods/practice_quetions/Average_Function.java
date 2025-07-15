import java.util.*;

// Enter 3 numbers from the user & make a function to print their average.

public class Average_Function {
    public static int averageNum (int a, int b, int c){
        // Note: We can use double instead of int for accurate decimal results
            int average;
            average = (a + b +c)/3;

            return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int averageSum = averageNum(a, b, c);
        System.out.println("Average of given numbers is: " + averageSum);

        sc.close();

    }
}

// output:

// 3
// 3
// 2
//Average of given numbers is: 2
















