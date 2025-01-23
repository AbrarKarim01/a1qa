package programmingLanguage;

public class Exceptions {

    public static void throwException(int age) {
        if (age < 18){
            throw new ArithmeticException("Must be 18 or older");
        }
        else {
            System.out.println("You are good to go");
        }
    }

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }finally {
            System.out.println("This will always run");
        }

        throwException(17);
    }
}
