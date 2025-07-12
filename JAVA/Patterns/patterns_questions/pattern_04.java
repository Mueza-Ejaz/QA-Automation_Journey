import java.util.*;

// Hollow Rectangle:

//    * * * *
//    * * *
//    * *
//    *



public class pattern_04 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int row = 4;
            // int col = 4;

            //outer for loop
        for(int i = 1; i <= row; i++){

            //inner loop
            for(int j = i; j <= row; j++){
                System.out.print("*");
            }

            System.out.println();
        }


        sc.close();
    }
}


//output: 1











