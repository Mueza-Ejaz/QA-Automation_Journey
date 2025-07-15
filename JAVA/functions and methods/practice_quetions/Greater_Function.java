import java.util.*;

// Write a function which takes in 2 numbers and returns the greater of those two.

public class Greater_Function {
    public static int greaterNumFinder (int a, int b){

        return Math.max(a, b);

        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = greaterNumFinder(a, b);
        System.out.println("Greater number is: " + result);

        sc.close();

    }
}

// output: 1
// 8
// 15
//Greater number is: 15


// output: 2
// -7
// -2
//Greater number is: -2
















