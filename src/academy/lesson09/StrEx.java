package academy.lesson09;

public class StrEx {

    public static void main(String[] args) {
        int l = 300000;
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < l; i++) {
            s += l;
        }
        System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println(start);
        System.out.println(end);
        long result  = end - start;
        System.out.println(result);

        StringBuilder builder = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < l; i++) {
            builder.append(l);
        }
        System.out.println(builder);
        end = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(end - start);
    }
}
