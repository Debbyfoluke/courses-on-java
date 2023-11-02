package java_course_part3.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show() {
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);


        for (var customer : map.values())
            System.out.println(customer);


        var exists = map.containsKey("e10");
        System.out.println(exists);




//        List<Customer> customers = new ArrayList<>();
//        for (var customer : customers)
//            if (customer.getEmail() == "e1")
//                System.out.println("Found");
    }
}
