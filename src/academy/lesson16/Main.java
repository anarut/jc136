package academy.lesson16;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println();

        String absolutePath = file.getAbsolutePath();
        absolutePath = "adasdas";

        File file1 = new File(".");

        System.out.println();

        boolean b = file1.canRead();
        boolean b1 = file1.setReadable(false);
//        boolean delete = file1.delete();




    }
}
