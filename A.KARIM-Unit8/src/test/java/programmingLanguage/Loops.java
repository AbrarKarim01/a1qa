package programmingLanguage;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        int num = 1;

        System.out.println("For Loop");

        for (int i = 0; i < 10; i++) {
            System.out.println(num);
            num++;
            break;
        }

        System.out.println("While Loop");
        System.out.println("Enter a number/'quit' to stop: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("quit")) {
            System.out.println("You entered: " + input);
            System.out.println("Enter a number/'quit' to stop: ");
            input = scanner.nextLine();
        }

        System.out.println("For-each Loop");
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int result : numbers){
            System.out.println(result);
        }
    }
}
