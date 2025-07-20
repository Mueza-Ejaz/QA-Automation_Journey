import java.util.*;

public class StringsPart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("Ayesha");
        System.out.println(sb);

//        // char at index 0
//        System.out.println(sb.charAt(0));
//
//        // set char at index 0
//        sb.setCharAt(0, 'I');
//        System.out.println(sb);


          // insert any value
          sb.insert(0,'M');
          System.out.println(sb);

        // delete extra value m
        sb.delete(0,1);
        System.out.println(sb);

        // append or lenght










        sc.close();
    }
}


// output:












































