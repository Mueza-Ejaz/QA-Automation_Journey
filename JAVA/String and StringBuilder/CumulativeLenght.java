import java.util.*;

// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.


public class CumulativeLenght {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");

        int n = sc.nextInt();
        String [] strArray = new String[n];

        int totalLenght = 0;


        for(int i = 0; i < n; i++){
            strArray[i] = sc.next();
            totalLenght += strArray[i].length();
        }

        System.out.println("Cumulative length of all strings:" + totalLenght);


        sc.close();
    }
}


// output:

//Enter number of strings: 3
// mango
// orange
// mueza
//Cumulative length of all strings:16












































