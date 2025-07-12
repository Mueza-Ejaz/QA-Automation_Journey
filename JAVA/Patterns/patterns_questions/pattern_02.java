import java.util.*;

// Hollow Rectangle:

//    * * * * *
//    *       *
//    *       *
//    * * * * *



public class pattern_02 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int row = 4;
            int col = 5;

            //outer for loop
        for(int i = 1; i <= row; i++){
            //inner loop
            for(int j = 1; j <=col; j++){

                if(i == 1 || j == 1 || i == row || j == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }

            System.out.println();
        }


        sc.close();
    }
}


//output: 1











