package programmingLanguage;

public class Methods {

    public void parentMethod() {
        System.out.println("I am a parent method.");
    }

    public void myMethod() {
        System.out.println("Hello I am a non-static method!");
    }

    public static void myStaticMethod() {
        System.out.println("Hello I am a static method!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) { // method overloading
        return a + b;
    }

    class Person {
        public void character() {
            System.out.println("I am a good person.");
        }
    }

    class Student extends Person {
        @Override
        public void character() {
            System.out.println("I am a good student.");
        }
    }

    static void myParaMethod(String name, int age) {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public void varargs(int ... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        myStaticMethod(); // static method does not require an object of the class.

        Methods methodExample = new Methods();
        methodExample.myMethod();

        System.out.println(methodExample.add(2, 3));
        System.out.println(methodExample.add(2.5, 3.5));

        Person person = methodExample.new Person();
        person.character();
        Person student = methodExample.new Student();
        student.character();

        myParaMethod("Abrar", 27);

        methodExample.parentMethod();

        methodExample.varargs(1, 2, 3, 4, 5);
    }
}
