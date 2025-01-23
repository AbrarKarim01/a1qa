package programmingLanguage;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        Consumer<Integer> printNumber = number -> System.out.println(number);
        numbers.forEach(printNumber);
    }
}
