package Survey;

import java.util.List;

public class NewSurvey {
    public static void main(String[] args) {
        List<String> questions = List.of(
                "strawberry", "pineapple", "apple", "pear");

        for (String question : questions) {
            if (question.length()>5){
                System.out.println(question);
            }
        }
        questions.stream()
                .filter(question -> question.length() > 5)
                .forEach(System.out::println);
    }
}
