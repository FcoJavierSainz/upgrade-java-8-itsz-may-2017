package modulo2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class Normalize {
    public static void main(String[] args) {
        Path file = Paths.get("../java-programmer/./file1");
        System.out.println(file.toAbsolutePath().normalize());
        Path currentFolder = Paths.get(".");
        Path file2 = Paths.get("file1").toAbsolutePath();
        file2 = currentFolder.resolve(file2);
        System.out.println(file2.resolveSibling("file2"));
    }
}
