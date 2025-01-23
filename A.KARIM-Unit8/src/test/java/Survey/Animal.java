package Survey;

public abstract class Animal {
    private String name;
    private int age;
    public static String value;

    public Animal(String name, int age, String value) {
        this.name = name;
        this.age = age;
        this.value = value;
    }

    public void eat() {
        System.out.println("Nom nom nom");
    }

    void getName() {
        System.out.println(name);
    }

    public static void getName(String name) {
        System.out.println(name);
    }

    abstract void run(String food, int quantity);

    public abstract void sleep();

    static void voice() {
        System.out.println("Woof woof");
    }
}
