package academy.lesson14;

public class MyException extends Exception {

    private String detail;

    public MyException(String message, Throwable cause, String detail) {
        super(message, cause);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}
