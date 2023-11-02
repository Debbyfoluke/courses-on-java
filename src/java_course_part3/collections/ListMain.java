package java_course_part3.collections;

import java_course_part3.collections.GenericList;

public class ListMain {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        for (var item : list)
            System.out.println(item);
        }



//        list.add("a");
//        list.add("b");
//        for (var item : list.items)
//            System.out.println(item);
    }

