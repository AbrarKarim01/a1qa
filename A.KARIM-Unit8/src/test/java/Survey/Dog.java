package Survey;

public class Dog extends Animal implements Interface {
    private String breed;

    public Dog(String name, int age, String breed, String value) {
        super(name, age, value);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    void run(String food, int quantity) {

    }

    @Override
    public void food(String food, int quantity) {

    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void eat(String food, int quantity) {
        System.out.println(String.format("Dog is eating %s %d", food, quantity));
    }
}
