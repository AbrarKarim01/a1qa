package Survey;

import java.util.ArrayList;
import java.util.List;

public class evenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
        numbers.forEach(System.out::println);
    }
}
