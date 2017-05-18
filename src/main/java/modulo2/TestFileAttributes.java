package modulo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class TestFileAttributes {
    public static void main(String[] args) throws IOException {

        Path file2 = Paths.get("file1");
        final Path path2 = Paths.get("/Users/JavierSainz/IdeaProjects/java-programmer/symlink");
        System.out.println(Files.exists(path2));
        System.out.println(Files.isSameFile(file2, path2));
        System.out.println(Files.size(file2));
        System.out.println(Files.isHidden(file2));
        System.out.println(Files.isReadable(file2));
        System.out.println(Files.isWritable(file2));
        System.out.println(Files.isDirectory(file2));
        System.out.println(Files.isExecutable(file2));
        System.out.println(Files.isRegularFile(file2));
        System.out.println(Files.isSymbolicLink(file2));
        System.out.println(Files.getOwner(file2));
        System.out.println(Files.getLastModifiedTime(file2));
        System.out.println(Files.isSymbolicLink(path2));
    }
}
