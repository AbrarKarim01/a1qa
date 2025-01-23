package consoleProject;

public class Monkey extends Animal {
    private String foodType;

    public Monkey(int age, double weight, String FoodType){
        super(age, weight);
        this.foodType = FoodType;
    }

    @Override
    public void eatFood(){
        System.out.println(String.format("This monkey loves %s", foodType));
    }
}
