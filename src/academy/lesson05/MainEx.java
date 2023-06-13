package academy.lesson05;

import java.util.Arrays;
import java.util.Random;

public class MainEx {

    public static void main(String[] args) {
        int n = 15;
        //Найти максимальное значение из массива.
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(199) - 99;
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        System.out.println(max);


        //Найти минмальный из элементов массива с нечетными индексами.
        int min = a[1];
        for (int i = 1; i < a.length; i = i + 2) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);

        //Разложить положительные и отрицательные числа по разным массивам.
        int[] arrPos;
        int[] arrNeg;
        int posCount = 0;
        int negCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                negCount++;
            }
            else if (a[i] > 0) {
                posCount++;
            }
        }
        arrPos = new int[posCount];
        arrNeg = new int[negCount];
        negCount = 0;
        posCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                arrNeg[negCount++] = a[i];
            }
            else if (a[i] > 0) {
                arrPos[posCount++] = a[i];
            }
        }
        System.out.println(Arrays.toString(arrNeg));
        System.out.println(Arrays.toString(arrPos));
    }
}
