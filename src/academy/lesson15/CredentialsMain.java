package academy.lesson15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CredentialsMain {

    public static void main(String[] args) throws Exception {
        output();
        input();
    }


    private static void input() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("creds.data");
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bis)) {

            Object o1 = ois.readObject();
            Object o2 = ois.readObject();

            if (o1 instanceof Credentials) {
                Credentials c = (Credentials) o1;
                System.out.println(c);
            }

            if (o2 instanceof Credentials c) {
                System.out.println(c);
            }
        }
    }

    private static void output() throws IOException {
        try (FileOutputStream fos = new FileOutputStream("creds.data");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            Credentials credentials1 = new Credentials("user1", "John", "1234");
            Credentials credentials2 = new Credentials("user2", "Alex", "test");
            oos.writeObject(credentials1);
            oos.writeObject(credentials2);
        }
    }
}
