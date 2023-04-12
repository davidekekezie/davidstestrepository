package assessment;

import java.util.Scanner;

public class scoreTotalCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int sum = 0;
        for (int counter= 0;counter<10;counter++){

            System.out.println("Enter your Scores");
            int userInput = input.nextInt();
            sum += userInput;




        }
        System.out.println("Your total score is->"+sum);

    }








}
