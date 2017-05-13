package modulo2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class DirectoryStreamSample {
    public static void main(String[] args) {
        Path path = Paths.get(".");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path element : stream) {
                System.out.println(element.getFileName() + "\t" + Files.isDirectory(element));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
