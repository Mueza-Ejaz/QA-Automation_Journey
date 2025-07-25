import java.util.*;

//Q1: Write a program that takes a sentence from the user and:

//- Counts how many times a specific character appears.
//- Counts the number of spaces.
//- Counts the number of words.


public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //User enter a sentence
        System.out.print("Enter a Word/Sentence: ");
        String words = sc.nextLine();

        //User enters a sentence, then a letter from it to count how many times that letter appears in the sentence.
        System.out.print("\n\uD83D\uDC49 Now enter the letter you want to count: ");
        String countLetters = sc.next();

        //counters
        int charCounter = 0;
        int spaceCounter = 0;

        //using split to separate words for count words
        String[] separateWords = words.split(" ");
        int countWords = separateWords.length;

        // loop for characters and spaces count
        for(int i = 0; i < words.length(); i++){
              char charConvert = words.charAt(i);

            if (charConvert == countLetters.charAt(0)) {
                charCounter++;
            }

            if(charConvert == ' '){
                spaceCounter++;
            }
        }

        System.out.println("\nThe letter *" + countLetters + "* appears " + charCounter + " times in the sentence.");
        System.out.println("Total words: " + countWords);
        System.out.println("Total spaces: " + spaceCounter);



        sc.close();

    }
}

// output:

//Enter a Word/Sentence: Mueza Ejaz is a manual tester.

// 👉 Now enter the letter you want to count: a

//The letter *a* appears 5 times in the sentence.
//Total words: 6
//Total spaces: 5






