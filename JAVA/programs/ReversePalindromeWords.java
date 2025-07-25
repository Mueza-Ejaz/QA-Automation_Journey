import java.util.*;

//Q2: Write a program that:

// 1- Takes a word from the user.
// 2- Reverses it using a for loop and charAt().
// 3- Checks if the word is a palindrome.


public class ReversePalindromeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //User enter a word
        System.out.print("Enter a Word: ");
        String word = sc.nextLine();

        String reversed = "";

        for(int i = word.length()-1;  i >= 0;  i--){
            reversed += word.charAt(i);
        }
        System.out.println("\nReversed word is: " + reversed);


        //using if else
        if(word.compareTo(reversed) == 0){
            System.out.println("It's a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }



        sc.close();

    }
}


// output: 1
//Enter a Word: mueza

//Reversed word is: azeum
//It's not a Palindrome


// output: 2
//Enter a Word: madam

//Reversed word is: madam
//It's a Palindrome








