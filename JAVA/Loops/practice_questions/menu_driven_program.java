import java.util.*;

//Make a menu-driven program. The user can enter 2 numbers, either 1 or 0.

//- If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
//- If they enter 0 then stop.
//- If he/ she scores :
//        Marks >=90 -> print “This is Good”
//        89 >= Marks >= 60 -> print “This is also Good”
//        59 >= Marks >= 0 -> print “This is Good as well”

//Because marks don’t matter but our effort does (Hint : use do-while loop but think & understand why).


public class menu_driven_program {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //using do while loop

            int i = 1;
            do{
               System.out.print("Enter 1 to continue or 0 to stop:");
               int num = sc.nextInt();

                        //using if else statement
                         if(num == 1){
                             System.out.print("Enter your marks(0 to 100):");
                                int marks = sc.nextInt();

                                //using if else statement
                                if(marks >= 90){
                                System.out.print("Your marks is Good\n");

                                }else if(marks >= 60){
                                 System.out.print("Your marks is also Good\n");

                                }else {
                                    System.out.print("Your marks is Good as well\n");

                                }

                         }

                i--;

               if (num == 0){
                   System.out.println("Exit");
                   break;
               }


            }while(i <= 0);


        sc.close();

    }
}


//output:

//Enter 1 to continue or 0 to stop:1
//Enter your marks(0 to 100):59
//Your marks is Good as well
//Enter 1 to continue or 0 to stop:1
//Enter your marks(0 to 100):85
//Your marks is also Good
//Enter 1 to continue or 0 to stop:0
//Exit








