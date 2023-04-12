package assessment;

public class patternPrinting {
    public static void main(String[] args) {

        int i = 0;
        while (i < 50) {
            //this is the main loop
        int j = 0;
        //the j being inside the while loop makes it reset to 0 each time the loop runs
        while (j<=i){

            System.out.print("*");
            //this Sout is so that the stars keep printing on the same line
            j++;

        }
//this print is so that the print enters a new line if its not there then it will print on one line
       System.out.println();
        i++;
//"\n"gives a new line when printing

        }


    }
}
