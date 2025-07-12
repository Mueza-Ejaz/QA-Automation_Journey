import java.util.*;



// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14



public class pattern_08 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int num = 1;

            //outer for loop
        for(int i = 1; i <= 5; i++){

            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
                if(num > 14){
                    break;
                }

            }

            System.out.println();
        }


        sc.close();
    }
}













