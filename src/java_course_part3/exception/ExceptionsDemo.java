package java_course_part3.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
           var cause = e.getCause();
            System.out.println(cause.getMessage());
        }


//        try {
//            account.deposit(-1);
//        } catch (IOException e) {
//            System.out.println("Logging");
//            throw e;
//        }

//        FileReader reader = null;
//        try {
//        try (
//                var  reader = new FileReader("file.txt");
//                var writer = new FileWriter("...");
//        ) {
//            var value = reader.read();
//        }
//        catch (IOException e) {
//            System.out.println("Could not read data.");
//        }
//        finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("File does not exist.");
//        }


//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("File opened");

//        sayHello(null);
    }
//    public static void sayHello(String name) {
//        System.out.println(name.toUpperCase());
//    }
}
