package academy.lesson11;

import java.math.BigDecimal;

public class AnotherAccount {

    private BigDecimal balance;

    public AnotherAccount(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
