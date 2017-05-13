package modulo2;

/**
 * Created by JavierSainz on 5/13/17.
 */

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FindAndCopyFile implements FileVisitor<Path> {
    public FileVisitResult preVisitDirectory(Path dir,
                                             BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().equals("file1")) {
            Files.copy(file, Paths.get("file3"));
            return FileVisitResult.TERMINATE;
        } else {
            return FileVisitResult.CONTINUE;
        }
    }

    public FileVisitResult visitFileFailed(Path file,
                                           IOException exc) throws IOException {
        return FileVisitResult.TERMINATE;
    }

    public FileVisitResult postVisitDirectory(Path dir,
                                              IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}