package modulo2;

/**
 * Created by JavierSainz on 5/12/17.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesViewSample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("file1");

        BasicFileAttributeView view =
                Files.getFileAttributeView(path, BasicFileAttributeView.class);
        BasicFileAttributes data = view.readAttributes();

        FileTime lastModifiedTime = FileTime.fromMillis(
                data.lastModifiedTime().toMillis() + 10_000);

        view.setTimes(lastModifiedTime, null, null);
    }
}