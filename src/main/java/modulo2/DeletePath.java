package modulo2;

/**
 * Created by JavierSainz on 5/13/17.
 */

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class DeletePath extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attrs) throws IOException {
        System.out.println("Deleting file: " + file.toAbsolutePath());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        if (exc != null) {
            System.out.println("Exception encountered " + exc.toString());
            throw exc;
        }
        System.out.println("Deleting directory: " + dir.toAbsolutePath());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}
