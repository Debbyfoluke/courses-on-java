package java_course_part3.generics;

public class Utils {
    public static <T extends Comparable> T max(T first, T second) {
        return (first.compareTo(second) > 0) ? first : second;
    }

    public static void  printUser(User user) {
        System.out.println(user);
    }
    public static void printUsers( GenericList<? super User> users) {
        GenericList<User> temp = new GenericList<>();
        Object x = users.get(0);
    }

//    public static <K, V> void print(K key, V value) {
//        System.out.println(key + "=" + value);
//    }
}

