import java.util.*;

//1- Grade Calculator
//Write a Java program to take marks (0–100) from the user and print the grade:

// -        90–100 → "Grade: A+"
// -        80–89 → "Grade: A"
// -        70–79 → "Grade: B"
// -        60–69 → "Grade: C"
// -        50–59 → "Grade: D"
// -        0–49 → "Fail"

//If the input is outside 0–100, print "Invalid Input".


public class Grade_Calculator {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //User enter number
            System.out.print("Enter a number btw (0-100)____.");
            int gradeNum = sc.nextInt();

            //if else statement
            if(gradeNum >= 90){
                System.out.println("Grade: A+");

            }else if(gradeNum >= 80){
                System.out.println("Grade: A");

            }else if(gradeNum >= 70){
                System.out.println("Grade: B");

            }else if(gradeNum >= 60){
                System.out.println("Grade: C");

            }else if(gradeNum >= 50){
                System.out.println("Grade: D");

            }else if(gradeNum >= 0){
                System.out.println("Fail");

            }else{
                System.out.println("Invalid Input");

            }



        //output: 1
//        Enter a number btw (0-100)____.95
//        Grade: A+

        //output: 2

//        Enter a number btw (0-100)____.49
//        Fail

        //output: 3

//        Enter a number btw (0-100)____.88
//        Grade: A



        }
    }
