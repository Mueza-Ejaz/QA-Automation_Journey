import java.util.*;

// Make a function to print the table of a given number n.

public class Table_Function {
    public static void table (int n){

        for(int i = 1; i <= 10; i++){
            System.out.println( n + "*" + i + "=" + n*i);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        table(n);

        sc.close();

    }
}

// output:

//         5
//        5*1=5
//        5*2=10
//        5*3=15
//        5*4=20
//        5*5=25
//        5*6=30
//        5*7=35
//        5*8=40
//        5*9=45
//        5*10=50














