package consoleProject;

public class Donkey extends Animal {
    String name;

    public Donkey(int age, double weight, String Name){
        super(age, weight);
        this.name = Name;
    }

    @Override
    public  void printInfo(){
        System.out.println(String.format("Donkey with name %s:  age  %d, weight %.2f", name, age, weight));
    }

    @Override
    public void eatFood(){
        System.out.println("Donkey is eating food");
    }
}
