package gitUploads;

import java.util.Scanner;

public class numberCounter {
    public static void main(String[] args) {


     int positiveNumbers =0;
     int negativeNumbers=0;
     int zero =0;

     int number=0;
        int nestedCounter = 0;
        Scanner input =new Scanner(System.in);

     while (nestedCounter!=-0 ){


            System.out.println("enter number or press -0 to end ");

            int inputNumber = input.nextInt();
            if (inputNumber > 0) positiveNumbers++;
            if (inputNumber < 0) negativeNumbers++;
            if (inputNumber == 0) zero++;
        }

     }



    }

