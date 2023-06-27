package academy.lesson09;

public class StringExercise {

    public static void main(String[] args) {
        String s = "sdauf";
        System.out.println("firstsim: " + s.charAt(0));
        int length = s.length();
        System.out.println("lastsim: " + s.charAt(length - 1));
        if (length % 2 == 1) {
            System.out.println(s.charAt(length / 2));
        }

        // Введите строку. Показать номера символов,
        // совпадающих с последним символом строки.
        String s2 = "gsfaugasdjhfgjfgkuhsasfdoiahfiuadsgfjhsdgfjlasdg";
        System.out.println(s2.length());
        char lastSymbol = s2.charAt(s2.length() - 1);
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == lastSymbol) {
                System.out.println(i);
            }
        }
        int l = 0;
        int index = s2.substring(l).indexOf(lastSymbol);
        while (index >= 0) {
            System.out.println(l + index);
            l = l + index + 1;
            index = s2.substring(l).indexOf(lastSymbol);
        }

        String[] split = s2.split(String.valueOf(lastSymbol));
        System.out.println();
        int idx = 0;
        for (String str : split) {
            System.out.println(idx + str.length());
            idx += str.length() + 1;
        }



    }
}
