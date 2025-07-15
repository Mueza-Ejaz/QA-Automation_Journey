import java.util.*;

// Write a function that takes in the radius as input and returns the circumference of a circle.

public class Radius_Function {
    public static double calCircumferenceRadius (int r){
            double Circumference;
            Circumference = 2 * 3.14 * r;

            return Circumference;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        double total = calCircumferenceRadius(r);
        System.out.println("Circumference of a radius circle is: " + total);

        sc.close();

    }
}

// output: 1
// 7
// Circumference of a radius circle is: 43.96


















