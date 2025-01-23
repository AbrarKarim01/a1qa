package programmingLanguage;

public class ClassesAndInterfaces {

    int age;
    String name;

    abstract class Person {
        public void personCharacter(){
            System.out.println("Person Character");
        }
    }

    // Person person = new Person(); // restricted class that cannot be used to create objects
    class Student extends Person {
        public void studentCharacter(){
            System.out.println("Student Character");
        }
    }

    // hide certain details and only show the important details of an object (interface).
    interface PersonInterface {
        void personCharacter();
    }

    // On implementation of an interface, you must override all of its methods
    class StudentInterface implements PersonInterface {
        public void personCharacter(){
            System.out.println("Person Character in Interface");
        }
    }

    public static void main(String[] args) {
        ClassesAndInterfaces obj = new ClassesAndInterfaces();
        obj.age = 20;
        obj.name = "John";
        System.out.println("Name: " + obj.name + " Age: " + obj.age);

        Student student = obj.new Student();
        student.personCharacter();
        student.studentCharacter();

        StudentInterface studentInterface = obj.new StudentInterface();
        studentInterface.personCharacter();
    }
}
