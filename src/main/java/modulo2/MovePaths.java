package modulo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class MovePaths {
    public static void main(String[] args) {

        Path file1 = Paths.get("file1");
        Path file2 = Paths.get("file2");
        try {
            Files.move(file1, file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
