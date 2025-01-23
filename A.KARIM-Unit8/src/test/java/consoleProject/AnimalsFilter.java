package consoleProject;

import java.util.List;

public class AnimalsFilter {

    public static List<Animal> filterByAge(List<Animal> animals, int minAge) {
        return animals.stream().filter(animal -> animal.age > minAge).toList();
    }
}
