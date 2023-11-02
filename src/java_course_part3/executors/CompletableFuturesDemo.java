package java_course_part3.executors;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class CompletableFuturesDemo {
//    public static CompletableFuture<String> getUserEmailAsync() {
//        return CompletableFuture.supplyAsync(() -> "email");
//    }
//
//
//    public static <email> CompletableFuture<String>getPlaylistAsync(String email){
//        return CompletableFuture.supplyAsync(() -> "playlist");
//    }
//    public static int toFahrenheit(int celsius) {
//        return(int) (celsius * 1.8) + 32;
//    }
    public static void show() throws ExecutionException, InterruptedException {
//        Supplier<Integer> task = () -> 1;
//        var future = CompletableFuture.supplyAsync(task);
//        try {
//           var result = future.get();
//            System.out.println(result);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

//        var future = CompletableFuture.supplyAsync(() ->1);
//        future.thenRunAsync(() -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Done");
//
//        });

//        var future = CompletableFuture.supplyAsync(() -> 1);
//        future.thenAcceptAsync(result -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);
//        });
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        var future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Getting the current weather");
//            throw new IllegalStateException();
//        });
//
//        try {
//            var temperature = future.exceptionally(ex -> 1).get();
//            System.out.println(temperature);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//
//        var future = CompletableFuture.supplyAsync(() -> 20);
//        try {
//            var result = future
//                    .thenApply(CompletableFuturesDemo::toFahrenheit)
//                    .get();
//            System.out.println(result);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

//        var future = CompletableFuture.supplyAsync(() -> 20);
//
//                future
//                     .thenApply(CompletableFuturesDemo::toFahrenheit)
//                     .thenAccept(f -> System.out.println(f));


//         getUserEmailAsync()
//                .thenCompose(CompletableFuturesDemo::getPlaylistAsync)
//                .thenAccept(playlist -> System.out.println(playlist));

//          var first = CompletableFuture
//                  .supplyAsync(() -> "20USD")
//                  .thenApply(str ->{
//                      var price = str.replace("USD", "");
//                      return Integer.parseInt(price);
//                  });
//          var second = CompletableFuture.supplyAsync(() -> 0.9);
//
//               first
//                  .thenCombine(second, (price,exchangeRate) -> price * exchangeRate)
//                  .thenAccept(result -> System.out.println(result));

//        var first = CompletableFuture.supplyAsync(() -> 1);
//        var second = CompletableFuture.supplyAsync(() -> 2);
//        var third = CompletableFuture.supplyAsync(() -> 3);
//        var all = CompletableFuture.allOf(first, second, third);
//        all.thenRun(() -> {
//            try {
//                var firstResult = first.get();
//                System.out.println(firstResult);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (ExecutionException e) {
//                throw new RuntimeException(e);
//            }
//
//            System.out.println("All tasks completed successfully");
//        });
//        var first = CompletableFuture.supplyAsync(() -> {
//            LongTask.simulate();
//            return 20;
//        });
//var second = CompletableFuture.supplyAsync(() -> 20);
//        CompletableFuture
//                .anyOf(first, second)
//                .thenAccept(temp -> System.out.println(temp));

//       var future = CompletableFuture.supplyAsync(() -> {
//           LongTask.simulate();
//           return 1;
//       });
//       var result = future.orTimeout(1, TimeUnit.SECONDS)
//               .get();
//        System.out.println(result);


        var start = LocalTime.now();

        var service = new FlightService();
        var futures = service.getQuotes()
                .map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList());

        CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> {
                    var end = LocalTime.now();
                    var duration = Duration.between(start, end);
                    System.out.println("Retrieved all quotes in " + duration.toMillis() + "msec.");
                });

        try{
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }


}
