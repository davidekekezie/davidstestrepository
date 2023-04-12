package tdd;

public class bookKeeper {

    public int numberOfCopies ;


    public void copies(int numberOfCopies) {

        this.numberOfCopies = numberOfCopies;


    }
    public int getNumberOfCopies(){
        if (numberOfCopies>0 && numberOfCopies<=4)return numberOfCopies*2000;
        else if (numberOfCopies>=5 && numberOfCopies<=9) return numberOfCopies*1800;
        else if (numberOfCopies>=10 && numberOfCopies<=29) return numberOfCopies*1600;
        else if (numberOfCopies>=30 && numberOfCopies<=49) return numberOfCopies*1500;
        else if (numberOfCopies>=50 && numberOfCopies<=99) return numberOfCopies*1300;
        else if (numberOfCopies>=100 && numberOfCopies<=199) return numberOfCopies*1200;
        else if (numberOfCopies>=200 && numberOfCopies<=499)return numberOfCopies*1100;
        else if (numberOfCopies>=500) return numberOfCopies*1000;
        else return 0;



    }


}
