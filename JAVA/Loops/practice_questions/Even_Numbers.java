import java.util.*;

//Print all even numbers till n.Run loop on your system and analyze what happens. Try to think of the
// reason for the output produced.


public class Even_Numbers {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //user enter a number
            System.out.print("Enter a number:");
            int num = sc.nextInt();


            //using for loop
            for(int i= 1; i <= num; i++ ){
                if(i % 2 == 0){
                    System.out.println(i);
                }

            }

        sc.close();

    }
}


//output:

//Enter a number:19
//        2
//        4
//        6
//        8
//        10
//        12
//        14
//        16
//        18




