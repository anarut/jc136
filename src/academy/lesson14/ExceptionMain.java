package academy.lesson14;

import academy.lesson07.Point;

public class ExceptionMain {

    public static void main(String[] args) {
        try {
            Point p = null;
            int y = p.getY();
        } catch (Throwable e) {
            String message = e.getMessage();
            System.out.println(message);
        }

    }

}
