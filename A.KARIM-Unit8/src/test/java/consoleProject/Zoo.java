package consoleProject;

import java.util.List;

public class Zoo {
    private String city;
    private List<Animal> animals;

    public Zoo(String city, List<Animal> animals){
        this.city = city;
        this.animals = animals;
    }

    public String getCity() {
        return city;
    }

    public void printAnimals() {
        System.out.println(String.format("In %s zoo we have animals: ", city));
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).printInfo();
        }
    }

    public void feedAnimals() {
        int index = 0;
        System.out.println(String.format("Lets feed animals in %s Zoo!", city));
        while (index < animals.size()) {
            animals.get(index).eatFood();
            index++;
        }
    }
}
