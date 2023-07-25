package academy.lesson17;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main4 {

    public static void main(String[] args) {
        Predicate<String> p = s -> s.length() > 4;

        boolean sun = p.test("sun");
        boolean weekend = p.test("weekend");

        Function<String, Integer> f = s -> s.length();
        Consumer<String> c = s -> System.out.println("you typed: " + s);
        Supplier<Integer> s = () -> new Random().nextInt(10);

        BiFunction<String, String, Integer> bf;

        System.out.println(s.get());
        System.out.println(s.get());
        c.accept("Hi");
        c.accept("Goodbye");
        System.out.println(f.apply("test"));
        System.out.println(f.apply("go go go"));

        UnaryOperator<Integer> m = a -> a * a;
        Function<Integer, Integer> f2 = m;


        IntStream intStream = IntStream.of(1, 2, 2, 2);
        Stream<Integer> integerStream = Stream.of(1, 2, 2, 2);
    }
}
