package modulo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class ReadFile {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/modulo2/FileChecksum.java");
        try {
            final List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle file I/O exception...
        }

        try {
            Files.lines(path).forEach(System.out::println);

            //Files.readAllLines(path).filter(s -> s.length()>2).forEach(System.out::println);

            //Files.lines(path).filter(s -> s.length()>2).forEach(System.out::println);
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
