package academy.lesson05;

import java.util.Arrays;
import java.util.Random;

public class MainMatrix {

    static final double PI = 3.14;

    public static void main(String[] args) {
        //Найти строку матрицы с максимальной суммой элементов.
        final int n = new Random().nextInt(10);
        int m = 3;
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = new Random().nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int maxSum = 0;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (maxSum < sum) {
                maxSum = sum;
                pos = i;
            }
        }
        System.out.println(pos);



        int[] a = new int[10];
        Arrays.fill(a, 3);

    }
}
