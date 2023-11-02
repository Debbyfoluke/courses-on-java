package java_course_part3.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExecutorsMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorsDemo.show();
        CompletableFuturesDemo.show();

//        var service = new MailService();
//        service.sendAsync();
//        System.out.println("Hello World");
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
