package assessment;

import java.util.Scanner;

public class validScoreCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        int validScores=0;
        while (validScores < 5) {


            System.out.println("Enter your number");
            int userScore = input.nextInt();

            if (userScore >= 0 && userScore <= 100) {
                sum += userScore;
                validScores++;}

            counter++;

        }
        System.out.println("your total score is ->"+sum);
        System.out.println("Your average of valid scores is ->"+sum / validScores);
        System.out.println("number of valid scores ==>"+validScores);


    }
}
