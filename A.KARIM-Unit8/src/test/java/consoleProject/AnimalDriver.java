package consoleProject;

import java.util.ArrayList;
import java.util.List;

public class AnimalDriver {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(25, 70));
        animals.add(new Animal(3, 4.55));
        animals.add(new Monkey(10, 39.5, "Banana"));
        animals.add(new Donkey(12, 69, "Donny"));
        animals.add(new Monkey(18, 75, "Bamboo"));
        animals.add(new Donkey(2, 32.2, "Little"));

        Zoo zoo = new Zoo("New York", animals);
        zoo.printAnimals();
        zoo.feedAnimals();

        List<Animal> filteredAnimals = AnimalsFilter.filterByAge(animals, 10);
        Zoo filteredZoo = new Zoo("In City of grown-up animals zoo we have animals", filteredAnimals);
        filteredZoo.printAnimals();

        List<Zoo> zooList = new ArrayList<>();
        System.out.println("Practice with lambda");
        zooList.add(zoo);
        zooList.add(filteredZoo);

        zooList.stream().filter(z -> z.getCity().contains("grown-up")).forEach(z -> z.printAnimals());

    }
}
