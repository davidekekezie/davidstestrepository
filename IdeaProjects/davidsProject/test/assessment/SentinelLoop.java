package assessment;

import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    System.out.println("Enter sale price for your product or -1 to stop");
    int userInput =input.nextInt();
    int totalSales=0;
    while (userInput !=-1){
        totalSales+= userInput;
        System.out.println("Enter sale price for your product or -1 to stop");
        userInput = input.nextInt();

    }
        System.out.println("your total sales is "+totalSales);
    }







}
