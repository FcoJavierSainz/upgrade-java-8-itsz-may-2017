package modulo2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.stream.Stream;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class Find {
    public static void main(String[] args) {
        Path path = Paths.get(".");
        long dateFilter = 1420070400000l;
        System.out.println(new Date(dateFilter));
        try {
            Stream<Path> stream = Files.find(path, 10,
                    (p, a) -> p.toString().endsWith(".java")
                            && a.lastModifiedTime().toMillis() > dateFilter);
            stream.forEach(System.out::println);
        } catch (Exception e) {
            // Handle file I/O exception...
        }
    }
}
