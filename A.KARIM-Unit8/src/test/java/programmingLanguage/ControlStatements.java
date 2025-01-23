package programmingLanguage;

import java.util.Scanner;

public class ControlStatements {

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 20;
        int num3 = 30;

        if (num1 > num2) {
            System.out.println("Number 1 is greater than Number 2");
        } else if (num2 > num3) {
            System.out.println("Number 2 is greater than Number 1");
        }
        else {
            System.out.println("Number 3 is greater than Number 1 and Number 2");
        }

        String result = (num1 > 0) ? "Positive Number" : "Negative Number";
        System.out.println("Ternary: " + result);

        System.out.println("Enter a Number between 1 and 3: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        switch (number) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Number 1 is not 1, 2, or 3");
        }
    }
}
