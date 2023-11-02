package java_course_part3.lambdas;

import java.util.List;
import java.util.function.*;

public class LambdasDemo {
        public static void show() {
           UnaryOperator<Integer> square = n -> n * n;
           UnaryOperator<Integer> increment = n -> n + 1;

           var result = increment.andThen(square).apply(1);
            System.out.println(result);
        }
}

















//    BinaryOperator<Integer> add = (a, b) -> a + b;
//    Function<Integer, Integer> square = a -> a * a;
//
//    var result = add.andThen(square).apply(1, 2);
//            System.out.println(result);


//    Predicate<String> hasLeftBrace = str -> str.startsWith("{");
//    Predicate<String> hasRightBrace = str -> str.endsWith("}");
//
//    Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
//    var result = hasLeftAndRightBraces.test("key:value");


//    Predicate<String> isLongerThan5 = str -> str.length() > 5;
//    var result = isLongerThan5.test("sky");

//    Function<String, String> replaceColon = str-> str.replace(":", "=");
//    Function<String, String> addBraces = str -> "{" + str + "}";
//
//    var result =  replaceColon
//            .andThen(addBraces)
//            .apply("key:value");
//            System.out.println(result);
//
//                    var solution = addBraces.compose(replaceColon).apply("key:value");
//                    System.out.println(solution);

//    Function<String, Integer> map = str -> str.length();
//    var length = map.apply("Sky");
//            System.out.println(length);


//    Supplier<Double> getRandom = () -> Math.random();
//    var random = getRandom.get();
//            System.out.println(random);

//    List<String>list = List.of("a", "b", "c");
//    Consumer<String> print = item -> System.out.println(item);
//    Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//
//            list.forEach(print.andThen(printUpperCase).andThen(print));

//    List<Integer> list = List.of(1, 2, 3);
//
//            for (var item : list)
//                    System.out.println(item);
//
//                    list.forEach(item -> System.out.println(item));


//    public static void greet(Printer printer) {
//        printer.print("Hello World");
//    }

//    public LambdasDemo(String message) {
//    }

//    greet(LambdasDemo::new);
//          greet(LambdasDemo::new);

//
//    public void print(String message){}
//    public static  String prefix = "-";


//
//    var demo = new LambdasDemo();
//        greet(demo::print);
//        greet(demo::print);


//        greet(LambdasDemo::print);
//        greet(LambdasDemo::print);

//        greet(System.out::println);
//        greet(System.out::println);

//        greet(message -> System.out.println(prefix + message));
//
//        greet(message -> System.out.println(message));
//
//        Printer printer = message -> System.out.println(message);
