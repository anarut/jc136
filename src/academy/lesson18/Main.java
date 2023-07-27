package academy.lesson18;

import academy.lesson07.Point;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 2, 4, 5, 6, 78, 89, 9);
        Stream<Integer> integerStream = Stream.of(43, 123, 123, 12, 123, 12, 31, 23, 123, 12, 312);

        Stream<Integer> concat = Stream.concat(integerStream, integers.stream());


        // h e l l o k i t t y world
        Map<Character, Long> collect = Stream.of("Hello", "kitty", "world", "polymorphism")
                .flatMapToInt(s -> s.chars())
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(collect);


        Map<Character, List<Character>> collect1 = Stream.of("Hello", "kitty", "world", "polymorphism")
                .flatMapToInt(s -> s.chars())
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity()));

        System.out.println(collect1);


        int page = 58;
        int pageSize = 30;

        List<String> strings = List.of("", ""); // много значений (2282)
        // 58 стр
        List<String> collect2 = strings.stream()
                .skip((page - 1) * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());


        /*
       76 * 30 + 2 = общее кол-во товаров  2282
        */


        Optional<String> any = Stream.of("Hello", "kitty", "world", "polymorphism")
                .findAny();

        Optional<Object> any1 = Stream.of()
                .filter(s -> s != null)
                .filter(Objects::nonNull)
                .findAny();

        any1.ifPresent(val -> System.out.println(val));

        String ssss = any.get();


        Stream<Point> pointStream = Stream.of(
                new Point(1, 4),
                new Point(4, 7),
                new Point(5, 3),
                new Point(9, 2));

        Optional<Point> reduce1 = pointStream.reduce((p1, p2) ->
                new Point(p1.getX() + p2.getX(), p1.getY() + p2.getY()));

        Stream<Point> pointStream2 = Stream.of(
                new Point(1, 4),
                new Point(4, 7),
                new Point(5, 3),
                new Point(9, 2));

        Point reduce2 = pointStream2.reduce(new Point(0, 0), (p1, p2) ->
                new Point(p1.getX() + p2.getX(), p1.getY() + p2.getY()));

        Optional<Point> opt2 = Optional.of(reduce2);



        System.out.println(reduce1.orElseThrow());

        Stream<Point> pointStream3 = Stream.of(
                new Point(1, 4),
                new Point(4, 7),
                new Point(5, 3),
                new Point(9, 2));

        Integer sum = pointStream3.reduce(
                0,
                (s, p) -> s + (p.getX() + p.getY()),
                Integer::sum);

        int sum1 = Stream.of(
                        new Point(1, 4),
                        new Point(4, 7),
                        new Point(5, 3),
                        new Point(9, 2))
                .mapToInt(p -> p.getX() + p.getY())
                .sum();

        System.out.println(sum);
    }
}
