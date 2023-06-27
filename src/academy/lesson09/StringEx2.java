package academy.lesson09;

import java.util.Arrays;

public class StringEx2 {

    public static void main(String[] args) {
        //Поменяйте местами первое самое длинное слово с последним самым коротким?
        String s = "asd asd asd fsdg adg adf g adfh fd h fadhmdfkhjlkjgdfl adsgjkasdljld sdj sdf d sd d asd";
        System.out.println(s);
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));

        int firstLongWord = 0;
        int lastShortWord = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[firstLongWord].length() < words[i].length()) {
                firstLongWord = i;
            }

            if (words[lastShortWord].length() >= words[i].length()) {
                lastShortWord = i;
            }
        }

        {
            String temp = words[firstLongWord];
            words[firstLongWord] = words[lastShortWord];
            words[lastShortWord] = temp;
        }

        System.out.println(Arrays.toString(words));

        System.out.println(String.join(" ", words));


        System.out.println(String.join(", the ", "a", "b", "c", "d", "e"));
    }
}
