import java.util.*;



// 1
// 0  1
// 1  0  1
// 0  1  0  1
// 1  0  1  0  1


public class pattern_09 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            //outer for loop
        for(int i = 1; i <= 5; i++){

            //inner loop
            for(int j = 1; j <= i; j++){

                if((i + j) %2 == 0){
                    System.out.print(1 + " ");

                }else{
                    System.out.print(0 + " ");

                }

            }


            System.out.println();
        }


        sc.close();
    }
}













