package academy.lesson12;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueMain {

    public static void main(String[] args) {
        ArrayDeque<String> cities1 = new ArrayDeque<>();
        Deque<String> cities2 = new ArrayDeque<>();
        Queue<String> cities3 = new ArrayDeque<>();
        Collection<String> cities4 = new ArrayDeque<>();


        Deque<String> cities = new ArrayDeque<>();

        workWithQueue(new ArrayDeque<>());
        workWithQueue(new PriorityQueue<>());
        workWithQueue(new LinkedList<>());
        workWithQueue(new PriorityBlockingQueue<>());

        System.out.println();
        System.out.println();

        workWithDeque(new ArrayDeque<>());
        workWithDeque(new LinkedList<>());
    }

    public static void workWithDeque(Deque<String> cities) {
        cities.push("Oslo");
        cities.push("Minsk");
        System.out.println(cities);
        cities.push("Pinsk");
        cities.push("Warslaw");
        System.out.println(cities);
        String pop = cities.pop();
        System.out.println(cities);
        String pop1 = cities.pop();
        System.out.println(cities);
        cities.addFirst("Kracov");
        cities.add("Paris");
        cities.offer("Viena");
        cities.offerFirst("Milan");
        cities.offerLast("Rome");
        cities.addLast("Lion");
        cities.push("London");
        System.out.println(cities);


    }

    public static void workWithQueue(Queue<String> cities) {
        cities.offer("Minsk");
        cities.offer("New York");
        cities.offer("Paris");
        cities.add("Barcelona");
        cities.offer("Sydney");
        System.out.println(cities);
        cities.offer("Oslo");
        cities.offer("Moscow");
        System.out.println(cities);
        String poll = cities.poll();
        System.out.println(poll);
        String peek = cities.peek();
        System.out.println(peek);
        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(cities.contains("Oslo"));
        System.out.println(cities.contains("Madrid"));
        System.out.println(cities.remove("Paris"));
        System.out.println(cities);
    }
}
