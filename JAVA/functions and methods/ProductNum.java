import java.util.*;

// Make a function to multiply two numbers and return the product.

public class ProductNum {
    public static int multiplyNum(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();

       int product = multiplyNum(a, b);

       System.out.println("The product of two numbers is: " + product);

        sc.close();

    }
}

// cli output

// 2
// 4
// The product of two numbers is: 8
















