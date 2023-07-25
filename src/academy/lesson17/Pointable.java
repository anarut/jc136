package academy.lesson17;

import academy.lesson07.Point;

@FunctionalInterface
public interface Pointable {

    Point apply(int a, int b);

//    Point apply(int a, int b, int c);
}
