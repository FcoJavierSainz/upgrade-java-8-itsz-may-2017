package modulo1;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by JavierSainz on 5/5/17.
 */
public class PreciseRetrow {
    //Before Java 7
    public static void beforeJava7() throws ParseException, IOException {
        try {
            new SimpleDateFormat("yyyyMMdd").parse("foo");
            new FileReader("file.txt").read();
        } catch (ParseException e) {
            System.out.println("Caught exception: " + e.getMessage());
            throw e;
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
            throw e;
        }
    }

    //Throwing a general exception
    public static void beforeJava7_2() throws Exception {
        try {
            new SimpleDateFormat("yyyyMMdd").parse("foo");
            new FileReader("file.txt").read();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            throw e;
        }
    }

    // java 7: precise rethrow.
    // no longer "throws Exception"
    public static void precise() throws ParseException, IOException {
        try {
            new SimpleDateFormat("yyyyMMdd").parse("foo");
            new FileReader("file.txt").read();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            throw e;
        }
    }

    //this example handles ParseException
    public static void precise2() throws IOException {
        try {
            new SimpleDateFormat("yyyyMMdd").parse("foo");
            new FileReader("file.txt").read();
        } catch (ParseException e) {
            System.out.println("Parse Exception");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            throw e;
        }
    }
}
