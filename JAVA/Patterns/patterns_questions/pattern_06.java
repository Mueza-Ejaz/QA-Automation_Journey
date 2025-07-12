import java.util.*;



// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5



public class pattern_06 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);



            //outer for loop
        for(int i = 1; i <= 5; i++){
            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


        sc.close();
    }
}


//output: 1











