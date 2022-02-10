package AlgorithmExampleQuestions;

import java.util.*;

public class Question25 {
    
    // Write a method which takes students midtermMark and finalMark marks to calculate students average

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your midtermMark and finalMark marks to calculate your average: ");
        double midtermMark = scan.nextInt(), finalMark = scan.nextInt();

        double result = avrCalculator(midtermMark, finalMark);
        System.out.println("Your average is: " + result);

    }

    public static  double avrCalculator(double midtermMark, double finalMark){

        double average;
        
        average = (midtermMark / 100 * 40) + (finalMark / 100 * 60);

        return average;

    }

}
