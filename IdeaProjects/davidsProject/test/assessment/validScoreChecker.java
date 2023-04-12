package assessment;

import java.util.Scanner;

public class validScoreChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int sum=0;

        while(counter<5) {


            System.out.println("Enter your number");
            int userScore = input.nextInt();

           if(userScore>=0 && userScore<=100) sum += userScore;

            counter++;

        }
        System.out.println("your total score is ->"+sum);

    }

}
