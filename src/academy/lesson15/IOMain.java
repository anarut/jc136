package academy.lesson15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IOMain {

    public static void main(String[] args) throws Exception {
        try (FileWriter fw = new FileWriter("readme.txt");
             BufferedWriter bf = new BufferedWriter(fw)) {

            fw.write("Wonderful");
            fw.flush();
            fw.write("\n");
            fw.write("Good");

        }

        try (FileReader fr = new FileReader("readme.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String s = br.readLine();
            while (s != null) {
                System.out.println(s);
                System.out.println("-- system -- ");
                s = br.readLine();
            }
        }

    }
}
