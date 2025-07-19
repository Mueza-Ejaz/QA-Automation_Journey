import java.util.*;

//Input an email from the user. You have to create a username from the
//email by deleting the part that comes after ‘@’. Display that username to
//the user.
//Example :
//email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
//email = “helloWorld123@gmail.com”; username = “helloWorld123”


public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a email: ");
        String email = sc.nextLine();

        int atIndex = email.indexOf("@");

        String username = email.substring(0, atIndex);

        System.out.println(username);



        sc.close();
    }
}


// output: 1

//Enter a email: muezaejaz@gmail.com 
// muezaejaz











































