package programmingLanguage;
import java.util.*;

public class Collections {

    public static void main(String[] args) {
        // ArrayList is a class that implements the List interface
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);
        System.out.println(list);

//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        list.add(1,50);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(Integer.valueOf(50));
        System.out.println(list);
        list.set(0, 100);
        System.out.println(list);

        // Stack is a class that extends Vector and implements the List interface
        Stack<String> animals = new Stack<>();
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Horse");
        System.out.println(animals);

        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);

        // LinkedList is a class that implements the Queue interface
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.peek());

        // HashSet is a class that implements the Set interface
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        set.add(1);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);

        // HashMap is a class that implements the Map interface
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println(numbers);

        numbers.put("One", 6);
        System.out.println(numbers);
        numbers.put("One", 60);
        System.out.println(numbers);

        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + entry.getKey());
        }

        for (String key : numbers.keySet()) {
            System.out.println(key);
        }
        numbers.keySet().forEach(System.out::println);
    }
}
