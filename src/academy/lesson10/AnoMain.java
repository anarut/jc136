package academy.lesson10;

import academy.lesson08.Speakable;

public class AnoMain {

    abstract static class Test {
        public abstract void test();
    }


    public static void main(String[] args) {
        Test test = new Test() {
            @Override
            public void test() {
                System.out.println("test");
            }
        };

        AnoMain anoMain = new AnoMain();
        AnoMain anoMain2 = new AnoMain() {};
        Speakable speakable = new Speakable() {
            @Override
            public void speak() {
                System.out.println("spikau");
                toDo();
            }

            void toDo() {
                System.out.println("todododo");
            }
        };

        System.out.println();



        Speakable speakable4 = new Speakable() {
            @Override
            public void speak() {
                System.out.println();
            }
        };
        Speakable speakable5 = () -> System.out.println();
        Speakable speakable6 = System.out::println;
    }
}
