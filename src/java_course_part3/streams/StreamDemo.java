package java_course_part3.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void show() {
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);




//        var movies = List.of(
//                new Movie("a",10, Genre.THRILLER),
//                new Movie("b",20, Genre.ACTION),
//                new Movie("c",30, Genre.ACTION)
//        );

//       var result = movies.stream()
//                .collect(Collectors.partitioningBy(
//                        m -> m.getLikes() > 20,
//                        Collectors.mapping(Movie::getTitle,
//                                Collectors.joining(","))));
//
//        System.out.println(result);







//var result = movies.stream()
//        .collect(Collectors.groupingBy(
//                Movie::getGenre,
//                Collectors.toSet()));
//
//
//        System.out.println(result);
//
//
//
//        var outcome = movies.stream()
//                .collect(Collectors.groupingBy(
//                        Movie::getGenre,
//                        Collectors.mapping(Movie::getTitle, Collectors.joining(","))));
//
//
//        System.out.println(outcome);
//

//        var result = movies.stream()
//                .filter(m -> m.getLikes() > 10)
//                .map(Movie::getTitle)
//                .collect(Collectors.joining(","));
//        System.out.println(result);
//

//        Optional<Integer> sum = movies.stream()
//                .map(m -> m.getLikes())
//                .reduce(Integer::sum);
//
//        System.out.println(sum.orElse(0));
//
//
//
//        Integer total = movies.stream()
//                .map(m -> m.getLikes())
//                .reduce(0,Integer::sum);
//
//        System.out.println(total);
//

//        var result = movies.stream()
//                .findFirst()
//                .get();
//
//        System.out.println(result.getTitle());
//
//        var output = movies.stream()
//                .max(Comparator.comparing(Movie::getLikes))
//                .get();
//
//        System.out.println(output.getTitle());
//
//        var result = movies.stream()
//                .anyMatch(m -> m.getLikes() > 20);
//
//        System.out.println(result);

//        movies.stream()
//                .filter(m -> m.getLikes() > 10)
//                .peek(m -> System.out.println("filtered: " + m.getTitle()))
//                .map(Movie::getTitle)
//                .peek(t -> System.out.println("mapped: " + t))
//                .forEach(System.out::println);

//        movies.stream()
//                .map(Movie::getLikes)
//                .distinct()
//                .forEach(System.out::println);

//        movies.stream()
//                .sorted(Comparator.comparing(Movie::getTitle).reversed())
//                .forEach(m -> System.out.println(m.getTitle()));
//
//

//        movies.stream()
//                .limit(2)
//                .forEach(m -> System.out.println(m.getTitle()));
//
//        movies.stream()
//                .skip(2)
//                .forEach(m -> System.out.println(m.getTitle()));
//
//        movies.stream()
//                .takeWhile(m -> m.getLikes() < 30)
//                .forEach(m -> System.out.println(m.getTitle()));
//
//        movies.stream()
//                .dropWhile(m -> m.getLikes() < 30)
//                .forEach(m -> System.out.println(m.getTitle()));


//        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
//
//        movies.stream()
//                .filter(isPopular)
//                .forEach(m -> System.out.println(m.getTitle()));

//        var stream = Stream.of(List.of(1, 2, 3 ), List.of(4, 5, 6));
//        stream
//                .flatMap(list -> list.stream())
//                .forEach(n -> System.out.println(n));



//        movies.stream()
//                .mapToInt(movie -> movie.getLikes())
//                .forEach(name -> System.out.println(name));






//        int count = 0;
//        for (var movie : movies)
//            if (movie.getLikes() > 10)
//                count++;
//
//        var count2 = movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .count();
    }
}
