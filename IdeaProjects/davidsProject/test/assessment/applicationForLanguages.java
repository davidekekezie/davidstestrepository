package assessment;

import java.util.Scanner;

public class applicationForLanguages {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("If you want English press 1");
        System.out.println("If you want Yoruba press 2");
        System.out.println("If you want Igbo press 3");
        System.out.println("If you want Hausa press 4");
        int choice = input.nextInt();
        switch (choice){

            case 1 -> System.out.println("English");
            case 2 -> System.out.println("Yoruba");
            case 3 -> System.out.println("Igbo");
            case 4 -> System.out.println("Hausa");
            default -> System.out.println("have sense");




        }









    }
}
