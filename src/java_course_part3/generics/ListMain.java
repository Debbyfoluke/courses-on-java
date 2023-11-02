package java_course_part3.generics;

public class ListMain {
    public static void main(String[] args) {
        var instructors = new GenericList<User>();
        var users = new GenericList<User>();
        Utils.printUsers(users);

//        User user = new Instructor(10);
//        Utils.printUser(new Instructor(10));

//        Utils.print(1, 10);

//       var max = Utils.max(new User(10), new User(20));
//        System.out.println(max);

//        var user1 = new User(10);
//        var user2 = new User(20);
//        if (user1.compareTo(user2) < 0)
//            System.out.println("user1 < user2");
//        else if (user1.compareTo(user2) == 0)
//            System.out.println("user1 == user2");
//        else
//            System.out.println("user1 > user2");




//        int  -> Integer
//        float - Float
//        boolean - Boolean

//        GenericList<Integer> numbers = new GenericList<>();
//        numbers.add(1);
//        int number = numbers.get(0);










//       var list = new GenericList<User>();
//       list.add(new User());
//       User user = list.get(0);

//       var list = new List();
//       list.add(Integer.valueOf(1));
//       list.add("1");
//       list.add(new User());
//
//       int number = (int) list.get(1);
    }
}
