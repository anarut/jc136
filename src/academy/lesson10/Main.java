package academy.lesson10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        Integer b = 1;


        int c = b + 1;

        System.out.println(a == b);


        BigInteger bigInteger = new BigInteger("12589462348568723465873426578263485763487563748658734652873467856314875634875678234657834659782343712831237127312");
        System.out.println(bigInteger);
        BigDecimal bigDecimal = new BigDecimal("1232321312312.32432423423423");
        System.out.println(bigDecimal);


    }
}
