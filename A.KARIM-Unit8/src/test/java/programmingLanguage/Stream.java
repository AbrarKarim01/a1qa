package programmingLanguage;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<String> names = new ArrayList();

        names.add("John");
        names.add("Abrar");
        names.add("Karim");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.stream().forEach(System.out::println);
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
        names.stream().toList().forEach(System.out::println);
        names.stream().sorted().forEach(System.out::println);

        // stream with forEach() loop
        List<String> animal = new ArrayList();
        names.add("Dog");
        names.add("Cat");
        names.add("Lion");
        names.stream().forEach(name -> System.out.println(name));

        //stream with filter
        List<Integer> numbers = List.of(1,2, 3, 4,5);
        animal.stream().filter(name -> name.startsWith("D")).forEach(System.out::println);
        //stream with filter() using collect() method and saving the result in a list with toList()
        List <Integer> result = numbers.stream().filter(number ->  number % 2 == 0).map(number -> number + 5).collect(Collectors.toList());
        result.forEach(System.out::println);

        //stream with map() method
        List<String> stringNumbers = List.of("1", "2", "3", "4", "5");
        stringNumbers.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}
