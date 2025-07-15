import java.util.*;

//Write a function that takes in age as input and returns if that person is eligible to vote or not.
// A person of age > 18 is eligible to vote.

public class Voting_Eligibility {
    public static void checkVotingEligibility (int age){
            if(age > 18){
                System.out.println("You are eligible to vote");

            }else{
                System.out.println("Not eligible to vote");
            }
          return;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        checkVotingEligibility(age);

        sc.close();

    }
}

// output: 1
// 17
// Not eligible to vote


// output: 2
// 27
// You are eligible to vote

















