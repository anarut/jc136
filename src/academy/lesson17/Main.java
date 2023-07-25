package academy.lesson17;

import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        Applicable sum = new Applicable() {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        };

        Applicable sum1 = (x, y) -> {
            System.out.println("SUM");
            return x + y;
        };

        Applicable sum2 = (x, y) -> x + y;

        BinaryOperator<Integer> sum3 = Integer::sum;

        Applicable sum4 =  sum2::apply;


        Applicable multiply = new Applicable() {
            @Override
            public int apply(int a, int b) {
                return a * b;
            }
        };

        int result1 = sum.apply(5, 7);
        int result2 = multiply.apply(4, 3);
        int result3 = sum.apply(0, 5);

        int i = 5 + 7;
        int i1 = 4 * 3;

        Applicable[] aa = {sum, multiply};
        operations(1, 2, aa);
        System.out.println();
        operations(1, 2,sum, multiply, sum, multiply, sum, sum);

    }

    public static void operations(int a, int b, Applicable... ops) {
//        Applicable[] ops1 = ops;
        for (Applicable aps : ops) {
            System.out.println("result: " + aps.apply(a, b));
        }
    }
}
