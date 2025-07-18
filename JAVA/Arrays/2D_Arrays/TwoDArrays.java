import java.util.*;

// 2D Arrays:
// type[][] arrayName = new type[rows][columns];

public class TwoDArrays {
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

        // using loop for printing
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
               System.out.print(numbers[i][j] + " ");

            }
            System.out.println();
        }


        sc.close();
    }
}


// output:

//Enter rows and columns:
//  3
//  5
//Enter rows and columns values:
//  1 2 3 4 5
//  5 4 3 2 1
//  1 2 3 4 5
//  1 2 3 4 5
//  5 4 3 2 1
//  1 2 3 4 5

































