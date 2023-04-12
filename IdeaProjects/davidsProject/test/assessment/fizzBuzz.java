package assessment;

public class fizzBuzz {

    public static void main(String[] args) {

        int i = 1;
        while (i<=1500){

            if (i%5 ==0 && i%3==0) System.out.println("FizzBuzz");

           else if (i % 3 == 0) System.out.println("fizz");
            else if (i% 5 == 0) System.out.println("buzz");
           else System.out.println(i);
            i++;

        }




    }




}
