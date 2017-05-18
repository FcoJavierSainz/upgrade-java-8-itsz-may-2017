package modulo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class CopyPaths {
    public static void main(String[] args) {
        Path file1 =  Paths.get("file1");
        Path file2 =  Paths.get("file2");
        try {
            Files.copy(file1, file2, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
