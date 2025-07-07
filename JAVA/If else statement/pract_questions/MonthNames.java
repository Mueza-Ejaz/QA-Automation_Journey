import java.util.*;

// Question: 01
//Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print‘February’ & so on.

public class MonthNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //user enter a month number
        System.out.println("Enter a number of the Month (1 to 12)\n");
        int monthNum = sc.nextInt();

        //using switch and break statements
        switch(monthNum){
            case 1:
                System.out.println("1- January");
                break;

            case 2:
                System.out.println("2- February");
                break;

            case 3:
                System.out.println("3- March");
                break;

            case 4:
                System.out.println("4- April");
                break;

            case 5:
                System.out.println("5- May");
                break;

            case 6:
                System.out.println("6- June");
                break;

            case 7:
                System.out.println("7- July");
                break;

            case 8:
                System.out.println("8- August");
                break;

            case 9:
                System.out.println("9- September");
                break;

            case 10:
                System.out.println("10- October");
                break;

            case 11:
                System.out.println("11- November");
                break;

            case 12:
                System.out.println("12- December");
                break;

            default:
                System.out.println("Invalid Enter Number ");
        }

    }
}

