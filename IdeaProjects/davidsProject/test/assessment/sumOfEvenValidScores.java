package assessment;

import java.util.Scanner;

public class sumOfEvenValidScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int validScores=0;
        int sumOfValidScores = 0;
        while (validScores <= 5) {


            System.out.println("Enter your number");
            int userScore = input.nextInt();


            if (userScore >= 0 && userScore <= 100) {
                sum += userScore;
                validScores++;}
            if (validScores%2==0) sumOfValidScores+=userScore;



        }

        System.out.println("your total of even valid scores is "+sumOfValidScores);


    }



}
