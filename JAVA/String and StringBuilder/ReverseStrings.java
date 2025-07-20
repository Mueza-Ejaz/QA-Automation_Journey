import java.util.*;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);

        sb.reverse();
        System.out.println(sb);



        sc.close();
    }
}

// output:

// Enter a string: apple
// elppa



