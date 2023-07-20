package academy.lesson15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String, String> getenv = System.getenv();
        Set<Map.Entry<String, String>> entries = getenv.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("%s = %s".formatted(entry.getKey(), entry.getValue()));
        }


        Properties properties = System.getProperties();
        properties.forEach((o, o2) -> System.out.println("%s = %s".formatted(o, o2)));
        FileOutputStream fileOutputStream = null;
        String name = "test_file.txt";
        try {
            //                      test/test_file.txt
            fileOutputStream = new FileOutputStream(name, true);
            fileOutputStream.write("AS\tdas\nsad".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();// !!! MUST
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try (FileInputStream fis = new FileInputStream(name)) {
            byte[] bytes = fis.readAllBytes();
            String s = new String(bytes);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
