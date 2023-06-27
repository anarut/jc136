package academy.lesson09;

public class ClassC extends ClassA {

    private ClassB classB;

    public ClassC(int b) {
        this.classB = new ClassB(b);
    }

    public ClassB getClassB() {
        return classB;
    }

    public void methodB() {
        classB.methodB();
    }

    public void anotherMethodB() {
        classB.anotherMethodB();
    }


    public static void main(String[] args) {
        ClassB classB = new ClassB(5);
        classB.methodB();

        ClassC classC = new ClassC(5);
        classC.getClassB().methodB();
    }
}
