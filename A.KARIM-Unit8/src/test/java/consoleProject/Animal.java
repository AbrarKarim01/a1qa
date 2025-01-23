package consoleProject;

public class Animal {
    public int age;
    public double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
    //change
    public void eatFood(){
        System.out.println("Animal is eating food");
    }

    public void printInfo(){
        System.out.println(String.format("My age is %d and my weight is %.2f" , age, weight));
    }
}
