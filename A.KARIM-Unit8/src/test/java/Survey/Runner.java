package Survey;

import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) == 3) {
//                continue;
//            }
//            System.out.println(numbers.get(i));
//        }

//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
//        int i = 0;
//        while (i < numbers.size()) {
//            System.out.println(numbers.get(i));
//            i++;
//        }
//
//        numbers.stream().forEach(System.out::println);
//
//        int x = 10;
//        double y = x;
//
//        int newX = (int) y;
//
//        System.out.println(newX);
//
//        boolean hasSecurityClearance = true;
//        boolean knowsPassword = false;
//
//        if (hasSecurityClearance && knowsPassword) {
//            System.out.println("Access granted");
//        } else {
//            System.out.println("Access denied");
//        }
//
//        try{
//        exceptionMethod();
//        }catch (FileNotFoundException e){
//            System.out.println("File not found");
//        }
//    }
//
//    public static void exceptionMethod() throws FileNotFoundException {
//            FileReader file = new FileReader("String.txt");
//        }
//      numbers.stream().forEach(System.out::println);
        numbers.stream().filter(number ->  number % 2 == 0).map(number -> number + 5).forEach(System.out::println);

        Animal animal = new Dog("Rex", 5, "Bulldog", "Dog1");
        animal.eat();
        ((Dog) animal).eat("meat", 10);

        Animal.voice();

        Animal animal2 = new Dog("Doggy", 2, "Shepheard", "Dog2");
        System.out.println(animal2.value);
        System.out.println(animal.value);

        Animal.getName("Dog");
    }
}
