package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {


    @Test
    public void depositMoneyTest(){
    //given

        Account davidAccount = new Account();
    //when
    davidAccount.deposit(2_000);

    //assert
    int balance =  davidAccount.getBalance();
    assertEquals(2_000, balance);
}

    @Test
    public void depositNegativeNumbers(){
        //given

        Account davidAccount = new Account();
        //when
        davidAccount.deposit(-2_000);

        //assert
        int balance =  davidAccount.getBalance();
        assertEquals(0, balance);
    }


    @Test
    public void doubleNumbers(){
        //given

        Account davidAccount = new Account();
        //when
        davidAccount.deposit(-2_000);
        davidAccount.deposit(1_0000);
        //assert
        int balance =  davidAccount.getBalance();
        assertEquals(1_0000, balance);
    }



    @Test
    public void withdrawalReview(){
        //given

        Account davidAccount = new Account();
        //when
        davidAccount.deposit(-2_000);
        davidAccount.withdrawal(1_0000);
        //assert
        int balance =  davidAccount.getBalance();
        assertEquals(0, balance);
    }






    @Test
    public void testUno() {
        //given

        Account davidAccount = new Account();
        //when
        davidAccount.deposit(5_000);
        davidAccount.withdrawal(3_000);
        //assert
        int balance = davidAccount.getBalance();
        assertEquals(2_000, balance);
    }

    @Test
    public void testForNegatives() {
        //given

        Account davidAccount = new Account();
        //when
        davidAccount.deposit(5_000);
        davidAccount.withdrawal(6_000);
        //assert
        int balance = davidAccount.getBalance();
         assertEquals(5_000, balance);
    }


    @Test
    public void testForAbsolute() {
        //given

        Account davidAccount = new Account();
        //when
        davidAccount.deposit(2_000);
        davidAccount.withdrawal(2_000);
        //assert
        int balance = davidAccount.getBalance();
        assertEquals(0, balance);
    }







}


