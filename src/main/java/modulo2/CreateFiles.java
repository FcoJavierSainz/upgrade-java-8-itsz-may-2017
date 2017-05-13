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
        Path fileToCreate = Paths.get("index.html");
        Path folder = Paths.get("web");
        Path folders = Paths.get("web/src/css");
        try {
            Files.createFile(fileToCreate);
            Files.createDirectory(folder);
            Files.createDirectories(folders);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
