import java.util.*;

// Taking an array as an input and printing its elements.

public class ArrayLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter elements of array size:");
        int size = sc.nextInt();

        int[] marks = new int[size];

        System.out.println("Enter array elements");

        for(int i = 0; i < size; i++){
            marks[i] = sc.nextInt();
        }


        System.out.println("Array Elements are:");

        for(int i = 0; i < size; i++){
            System.out.println(marks[i]);
        }



        sc.close();

    }
}


// output:

//Enter elements of array size:3
//Enter array elements
//  1
//  2
//  3
//Array Elements are:
//  1
//  2
//  3























