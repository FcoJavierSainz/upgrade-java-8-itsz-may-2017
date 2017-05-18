package modulo2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class TestFiles {
    public static void main(String[] args) {
        Path file = Paths.get("/Users/JavierSainz/IdeaProjects/java-programmer/file1");
        Path file2 = Paths.get("/Users/JavierSainz/IdeaProjects/java-programmer/file1");
        Path folder = file.getParent();
        System.out.println(file.compareTo(folder));
        System.out.println(file.startsWith(folder));
    }
}
