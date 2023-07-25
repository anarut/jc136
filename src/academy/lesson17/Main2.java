package academy.lesson17;

import academy.lesson07.Point;

import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {
        Pointable pointable1 = new Pointable() {
            @Override
            public Point apply(int a, int b) {
                return new Point(a, b);
            }
        };

        Pointable pointable2 = (a, b) -> new Point(a, b);
        Pointable pointable3 = Point::new;
    }

}
