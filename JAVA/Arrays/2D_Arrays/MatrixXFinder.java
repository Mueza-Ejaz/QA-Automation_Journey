import java.util.*;

// Take a matrix(2D array) as input from the user.Search for a given number x and print the indices at which it occurs.

public class MatrixXFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns: ");
        int rows = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Enter rows and columns values: ");

        //2D Arrays
        int[][] numbers = new int[rows][col];

        //input
        for(int i = 0; i < rows; i++){
            //output
            for(int j = 0; j < col; j++){
                numbers[i][j] = sc.nextInt();

            }
        }

        System.out.print("\n Enter the value of X to search in the array: ");
        int x = sc.nextInt();

        // using loop to find x value
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
               //compare with X
                if(numbers[i][j] == x){
                    System.out.println("X found at location " + i + " :" + j);
                }

            }

        }


        sc.close();
    }
}


// output:

//Enter rows and columns:
// 3
// 4
//Enter rows and columns values:
// 1 2 3 4
// 5 6 7 8
// 45 8 9 77

//Enter the value of X to search in the array: 45
//X found at location 2 :0









































