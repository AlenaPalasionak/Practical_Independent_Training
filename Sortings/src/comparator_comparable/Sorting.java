package comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting{
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("Cat");
        s.add("Mouse");
        s.add("Rabbit");
        s.add("Hamster");
        s.add("Guinea-pig");
        s.add("Tortoise");
        s.add("Bat");
        ComparatorClass comparatorClass = new ComparatorClass();
        Collections.sort(s,comparatorClass);
        System.out.println(s.toString());
    }

}
