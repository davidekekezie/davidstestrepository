package ShadesOfEvil;

import java.util.Scanner;

public class gradingWithSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;
        int totalScore = 0;
        System.out.println("how many students do you have");
        int numberOfStudents = input.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println("Enter a grade");
            int grade = input.nextInt();
            switch (grade / 10) {

                case 9:
                case 10:
                    gradeA++;
                    break;
                case 8:
                    gradeB++;
                    break;
                case 7 :
                    gradeC++;
                    break;
                case 6:
                    gradeD++;
                    break;
                default:gradeF++;






            }
            totalScore+=grade;



        }




        System.out.printf("grade A -->%d%n",gradeA);
        System.out.printf("grade B -->%d%n",gradeB);
        System.out.printf("grade C -->%d%n",gradeC);
        System.out.printf("grade D -->%d%n",gradeD);
        System.out.printf("grade F -->%d%n",gradeF);

        double averageScore = (double) totalScore/numberOfStudents;
        System.out.printf("Average Score of %d students is %2f",averageScore);
    }













}
