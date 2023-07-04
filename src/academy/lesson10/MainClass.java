package academy.lesson10;

public class MainClass {

    static int b;
    int a;

    public static class StaticClass {
        public void doSomething() {

            {

                int a = 1;
                class A {
                    int x;
                    int y;
                }
                A a1 = new A();
            }

            System.out.println(b);
        }
    }

    public class NonStaticClass {
        public void doSomething() {
            System.out.println(a + b);
        }

    }

    public static void main(String[] args) {
        MainClass.b = 5;
        MainClass mainClass = new MainClass();
        mainClass.a = 5;

        StaticClass staticClass = new MainClass.StaticClass();

        NonStaticClass nonStaticClass = mainClass.new NonStaticClass();
    }
}
