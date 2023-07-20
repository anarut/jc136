package academy.lesson14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.util.Random;

public class Ex2 {

    public static void main(String[] args) {
        try {
            readTextFromFile("exam_tests.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readTextFromFile(String fileName) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        FileInputStream fileInputStream = new FileInputStream(fileName);

        if (new Random().nextBoolean()) {
            AccessDeniedException accessDeniedException = new AccessDeniedException("");
            throw accessDeniedException;
        }
        return "";
    }
}
