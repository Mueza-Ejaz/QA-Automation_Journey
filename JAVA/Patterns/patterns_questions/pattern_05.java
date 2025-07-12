import java.util.*;

// Hollow Rectangle:

//          *
//        * *
//      * * *
//    * * * *



public class pattern_05 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int row = 4;


            //outer for loop
        for(int i = 1; i <= row; i++){

            //inner loop ->  space print
            for(int j = 3; j >= i; j--){
                System.out.print(" ");
            }

            //inner loop ->  stars print
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }


            System.out.println();
        }


        sc.close();
    }
}


//output: 1











