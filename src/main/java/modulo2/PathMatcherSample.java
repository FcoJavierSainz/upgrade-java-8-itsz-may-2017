package modulo2;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class PathMatcherSample {
    public static void main(String[] args) {
        PathMatcher pm = FileSystems.getDefault()
                .getPathMatcher("glob:*/*/*/*/*/*.java");
        Path path = Paths.get("");
        System.out.println(path.toAbsolutePath());
        try {
            Files.walk(path)
                    .filter(p -> pm.matches(p))
                    .forEach(System.out::println);
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
