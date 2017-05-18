package modulo2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/12/17.
 */
public class Relativize {
    public static void main(String[] args) {
        Path file1 = Paths.get("/Users/JavierSainz/IdeaProjects/java-programmer");
        Path file2 = Paths.get("/Users/JavierSainz/Documents/before.jpg");
        file2 = file1.relativize(file2);
        System.out.println(file2);
        System.out.println(file2.normalize());
    }
}
