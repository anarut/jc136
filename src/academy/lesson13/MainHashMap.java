package academy.lesson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainHashMap {

    public static void main(String[] args) {
        String s = "mgasdhjfgjsdhfgasdhfbpknpcobvnmiopvbunibcovynhadsfkajdsdadhkuasdgfihsdkuhfwehsvdhweFhfsdkbvuysdbcvwefweohsdfg".toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            Integer count = map.getOrDefault(key, 0);
            map.put(key, count + 1);
//            System.out.println(map);
        }

        List<Character> maxChar = new ArrayList<>();
        Integer max = 0;
        List<Character> minChar = new ArrayList<>();
        Integer min = s.length() + 1;


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (value >= max) {
                if (value > max) {
                    max = value;
                    maxChar.clear();
                }
                maxChar.add(key);
            }

            if (value < min) {
                min = value;
                minChar.clear();
                minChar.add(key);
            } else if (value.equals(min)) {
                minChar.add(key);
            }
        }

        System.out.println("max " + maxChar);
        System.out.println("min " + minChar);


    }
}
