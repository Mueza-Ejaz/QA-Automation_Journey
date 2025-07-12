import java.util.*;

// Hollow Rectangle:

//    *
//    * *
//    * * *
//    * * * *



public class pattern_03 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int row = 4;
            // int col = 4;

            //outer for loop
        for(int i = 1; i <= row; i++){

            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }


        sc.close();
    }
}


//output: 1











