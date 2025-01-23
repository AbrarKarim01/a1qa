package Survey;

import java.util.Arrays;
import java.util.List;

public class CountPopulationPlanets extends Planet{

    public CountPopulationPlanets(String name, int diameter, int population) {
        super(name, diameter, population);
    }

    public static void main(String[] args) {
    List<Planet> planets = Arrays.asList(
            new Planet("one", 10200, 1000),
            new Planet("two", 7200, 10000),
            new Planet("three", 8900, 1)
    );

    int result = planets.stream().filter(planet -> planet.getDiameter() < 10000).mapToInt(planet -> planet.getPopulation()).sum();
        System.out.println(result);
}

//    static class Planet {
//        private final String name;
//        private final int diameter;
//        private final int population;
//
//        public Planet(String name, int diameter, int population) {
//            this.name = name;
//            this.diameter = diameter;
//            this.population = population;
//        }
//    }
}
