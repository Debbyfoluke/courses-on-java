package java_course_part3.collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));

        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
        set1.addAll(set2);

        System.out.println(set1);

        set1.retainAll(set2);
        System.out.println(set1);

        set1.removeAll(set2);






//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "a", "b", "c", "c");
//        Set<String> set = new HashSet<>(collection);
//        System.out.println(set);

//        Set<String> set = new HashSet<>();
//        set.add("sky");
//        set.add("is");
//        set.add("blue");
//        set.add("blue");
//        System.out.println(set);
    }
}
