import java.util.*;

// Solid Rectangle:

//    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *



public class pattern_01 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int row = 4;
            int col = 5;

            //outer for loop
        for(int i = 1; i <= row; i++){

            //inner loop
            for(int j = 1; j <= col; j++){
                System.out.print("*");
            }

            System.out.println();
        }


        sc.close();
    }
}


//output: 1











