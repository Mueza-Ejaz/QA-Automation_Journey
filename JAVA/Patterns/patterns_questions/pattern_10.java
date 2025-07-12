import java.util.*;

//
//          * * * * *
//        * * * * *
//      * * * * *
//    * * * * *
//  * * * * *




public class pattern_10 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            //outer for loop
        for(int i = 1; i <= 5; i++){

            //inner loop
            for(int j = 1; j <= 5-i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }

            for(int k = i; k <= 5; k++){
                System.out.print("* ");
            }



            System.out.println();
        }


        sc.close();
    }
}













