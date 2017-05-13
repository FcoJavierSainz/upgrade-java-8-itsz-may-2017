package modulo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

/**
 * Created by JavierSainz on 5/12/17.
 */
public class FileAttributes {
    public static void main(String[] args) {
        try {
            final Path path = Paths.get("file1");
            System.out.println(Files.getLastModifiedTime(path).toMillis());

            Files.setLastModifiedTime(path,
                    FileTime.fromMillis(System.currentTimeMillis()));

            System.out.println(Files.getLastModifiedTime(path).toMillis());
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
