package modulo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class ListFiles {
    public static void main(String[] args) {
        try {
            Path path = Paths.get(".");
            Files.list(path)
                    .filter(p -> !Files.isDirectory(p))
                    .map(p -> p.toAbsolutePath().normalize())
                    .forEach(System.out::println);
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
