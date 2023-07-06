package academy.lesson11;

import academy.lesson08.GamePad;
import academy.lesson08.MegaGamePad;
import academy.lesson10.Day;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(12321);
        AnotherAccount anotherAccount = new AnotherAccount(BigDecimal.ONE);

        Integer balance = account.getBalance();
        BigDecimal balance1 = anotherAccount.getBalance();

        GenericAccount<Integer, Float, GamePad> a = new GenericAccount<>(12312);
        Integer balance2 = a.getBalance();

        GenericAccount<BigDecimal, BigDecimal, MegaGamePad> a1 = new GenericAccount<>(BigDecimal.ONE);
        BigDecimal balance3 = a1.getBalance();
    }
}
