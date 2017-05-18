package modulo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/12/17.
 */
public class CreateFiles {
    public static void main(String[] args) {
        Path folder = Paths.get("web");
        Path folders = Paths.get("web/src/css");
        Path fileToCreate = Paths.get("web/src/index.html");
        try {
            if (Files.notExists(folder)) {
                Files.createDirectory(folder);
            }
            if (Files.notExists(folders)) {
                Files.createDirectories(folders);
            }
            if (Files.notExists(fileToCreate)) {
                Files.createFile(fileToCreate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
