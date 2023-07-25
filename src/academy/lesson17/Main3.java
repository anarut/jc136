package academy.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {
        String text = """
                Alex:Hello
                Denis:Hi guys
                Boris:have a good day
                Alex:I love weather today
                Boris:me too
                Victor:Agree
                Andy:Goodbye
                Boris:Good night
                Kirill:I like chat a lot of words is my power
                """;

        // вернуть топ 3 чаттера (больше всего слов)
        List<String> topUsers = topChatters(text);

        System.out.println(topUsers);
    }

    public static List<String> topChatters(String text) {
        String[] split = text.split("\n");
        Arrays.stream(split)
                .forEach(System.out::println);

        record Pair(String name, int count) { }

        return Arrays.stream(split)
                .map(str -> str.split(":"))
                .map(str -> new Pair(str[0], str[1].split(" ").length))
                .collect(Collectors.groupingBy(Pair::name, Collectors.summingInt(Pair::count)))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // на подумать
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
