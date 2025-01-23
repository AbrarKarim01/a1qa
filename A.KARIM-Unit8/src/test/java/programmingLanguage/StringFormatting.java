package programmingLanguage;

public class StringFormatting {

    public static void main(String[] args) {
        String info = "Abrar is here";
        int age = 27;
        float weight = 70.2f;

        System.out.printf("Uppercase: " + info.toUpperCase() + "\n");
        System.out.printf("Lowercase: " + info.toLowerCase() + "\n");
        System.out.printf(info.contains("Abrar") + "\n");

        String concatenate = String.format("%s to code. " + "His age is %d and weight is %.2f", info, age, weight);
        System.out.println(concatenate);
    }
}
