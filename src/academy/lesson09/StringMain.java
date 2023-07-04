package academy.lesson09;

public class StringMain {

    char[] a;

    public static void main(String[] args) {
        String s = "hello students";
        System.out.println(s);
        char[] chars = { 'h', 'e', 'l', 'l', 'o'};
        String s1 = new String(chars);
        System.out.println(s1);
        System.out.println(chars.toString());

        for (char ch : chars) {
            System.out.println((int)ch);
        }

        String[] split = "asdfasgmadklga".split("[a,g]+");
        Integer a;


    }
}
