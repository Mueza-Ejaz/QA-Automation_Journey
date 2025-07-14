import java.util.*;

// print user's name using function.

public class UserName {
                      // identifier
    public static void printName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        printName(name);

        sc.close();

    }
}

// cli output

//mueza => input
//mueza => output













