package assessment;

import java.util.Scanner;

public class numbers {



 public static void main (String[]args){

     Scanner userInput = new Scanner(System.in);
     System.out.println("Enter first number");
     int firstNumber = userInput.nextInt();
     if(firstNumber>5)System.out.println("Number is greater than 5");
     if(firstNumber<5)System.out.println("Number is less than 5");
     if(firstNumber==5)System.out.println("Your number is 5");



 }



}











