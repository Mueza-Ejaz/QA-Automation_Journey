import java.util.*;

// Make a function to add two numbers and return type sum.

public class AddNum {
    public static int addNumbers(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();

       System.out.println("The sum of two numbers is: " + addNumbers(a, b));

        sc.close();

    }
}

// cli output

// 5
// 6
// The sum of two numbers is: 11















