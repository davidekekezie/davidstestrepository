package gitUploads;

import java.util.Scanner;

public class raisePowers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("input first number");
        int firstNumber =input.nextInt();

        System.out.println("input second number ");
        int secondNumber =input.nextInt();

        int squareFirst = secondNumber^firstNumber;
        int squareSecond = firstNumber^secondNumber;

        System.out.println("which number is the raise to power value (1 or 2)");
        int raised = input.nextInt();

        switch (raised){

            case 1 -> System.out.println(squareFirst);
            case 2 -> System.out.println(squareSecond);

        }



    }
}
