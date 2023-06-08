package academy.lesson03;

public class Main {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(33));
        System.out.println(Integer.toBinaryString(33 << 1));
        System.out.println(Integer.toBinaryString(33 >> 1));
        System.out.println(Integer.toBinaryString(33 >>> 1));



        System.out.println(Integer.toBinaryString(-33));
        System.out.println(Integer.toBinaryString(-33 << 1));
        System.out.println(Integer.toBinaryString(-33 >> 1));
        System.out.println(Integer.toBinaryString(-33 >>> 1));
        System.out.println(-33 << 1);
        System.out.println(-33 >> 1);
        System.out.println(-33 >>> 1);


    }
}
