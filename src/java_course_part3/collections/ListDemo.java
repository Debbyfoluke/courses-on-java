package java_course_part3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        System.out.println(list.indexOf("a"));
        System.out.println(list.lastIndexOf("a"));
        System.out.println(list.subList(0, 2));

        list.set(0,"a+");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);



//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add(0,"!");

    }
}
