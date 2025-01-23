package programmingLanguage;

public class TypeCasting {

    public static class Parent {
        public void parentMethod() {
            System.out.println("Parent");
        }
    }

    public static class Child extends Parent {
        public void childMethod() {
            System.out.println("Child");
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        double bigNum = num1;
        System.out.println("Automatic Type Cast Value: " + bigNum);

        double num2 = 10.59876;
        int smallNum = (int) num2;
        System.out.println("Manual Type Cast Value: " + smallNum);

        Parent parent = new Child();
        ((Child) parent).childMethod();
    }
}
