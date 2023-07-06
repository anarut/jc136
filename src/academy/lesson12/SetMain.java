package academy.lesson12;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Belarus");
        set.add("Ireland");
        set.add("Canada");
        set.add("Angola");
        System.out.println(set);
        set.add("France");
        set.add("Canada");
        System.out.println(set);
        set.add("USA");
        set.add("Mexico");
        System.out.println(set);
        set.add("USA");
        set.add("USA");
        set.add("USA");
        set.add("USA");
        set.add("USA");
        set.add("USA");
        set.add("USA");
        set.add("USA");
        System.out.println(set);

        Set<Integer> set2 = new TreeSet<>();
    }
}
