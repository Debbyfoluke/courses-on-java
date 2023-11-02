package java_course_part3.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b","c");

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other);
        System.out.println(collection.equals(other));





        var objectArray = collection.toArray();
        var stringArray = collection.toArray(new String[0]);

        collection.remove("a");
        System.out.println(collection);

        collection.clear();
        System.out.println(collection.isEmpty());

        var containsA = collection.contains("a");
        System.out.println(containsA);



//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
//        for (var item : collection)
//            System.out.println(item);

    }
}
