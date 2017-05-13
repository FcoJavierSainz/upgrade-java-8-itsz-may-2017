package modulo2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/12/17.
 */
public class Relativize {
    public static void main(String[] args) {
        Path file1 = Paths.get("file1");
        Path file2 = Paths.get("/Users/<user>/workspace/java-programmer/file2");
        file2 = file1.relativize(file2);
        System.out.println(file2);
        System.out.println(file2.normalize());
    }
}
