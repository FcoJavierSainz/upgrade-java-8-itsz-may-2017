package modulo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class FileVisitorSample {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("."), new FindAndCopyFile());
    }
}
