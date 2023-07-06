package academy.lesson11;

import academy.lesson08.GamePad;

public class GenericAccount<T extends Object,K extends Number,M extends GamePad> {

    private T balance;
    private T balance1;
    private K balance2;
    private M gamePad;

    public <L2 extends Number> L2 todo(L2 da) {
        return da;
    }

    public void todo() {
        float v = balance2.floatValue();
        gamePad.up();
        gamePad.down();
        gamePad.left();
        gamePad.left();
    }

    public GenericAccount(T balance) {
        this.balance = balance;
    }

    public T getBalance() {
        return balance;
    }

    public void setBalance(T balance) {
        this.balance = balance;
    }
}
