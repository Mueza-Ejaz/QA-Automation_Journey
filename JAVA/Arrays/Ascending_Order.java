import java.util.*;

//Take an array of numbers as input and check if it is an array sorted in
//ascending order.

//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//     {3, 4, 6, 2} is not sorted in ascending order.


public class Ascending_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size:");
        int size = sc.nextInt();

        int [] num = new int[size];
        System.out.println("Enter " + size + " array of elements: ");

        for(int i = 0; i < size; i++){
            num[i] = sc.nextInt();

        }

        boolean isSorted = true;
        for(int i = 0; i < size -1; i++){
            if(num[i] > num[i + 1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Array is sorted in ascending order.");

        }else{
            System.out.println("Array is not sorted in ascending order.");

        }


        sc.close();

    }
}

// output: 1

//Enter the array size:3
//Enter 3 array of elements:
//  1
//  2
//  4
//Array is sorted in ascending order.


// output: 2

//Enter the array size:3
//Enter 3 array of elements:
//  5
//  4
//  1
//Array is not sorted in ascending order.



























