package programmingLanguage;

public class Operators {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        System.out.println("Addition: " + result);

        result = num1 - num2;
        System.out.println("Subtraction: " + result);

        result = num1 * num2;
        System.out.println("Multiplication: " + result);

        result = num1 / num2;
        System.out.println("Division: " + result);

        result = num1 % num2;
        System.out.println("Modulus: " + result);

        num1++;
        System.out.println("Increment: " + num1);

        num2--;
        System.out.println("Decrement: " + num2);

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("Logical AND: " + (isTrue && isFalse));
        System.out.println("Logical OR: " + (isTrue || isFalse));
        System.out.println("Logical NOT: " + (!isTrue));

        System.out.println("Equal: " + (num1 == num2));
        System.out.println("Not Equal: " + (num1 != num2));
        System.out.println("Greater Than: " + (num1 > num2));
        System.out.println("Less Than: " + (num1 < num2));
        System.out.println("Greater Than or Equal: " + (num1 >= num2));
        System.out.println("Less Than or Equal: " + (num1 <= num2));
    }
}
