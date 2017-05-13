package modulo2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/12/17.
 */
public class CopyFromStandarInput {
    public static void main(String[] args) {
        try (InputStream in = System.in) {
            Path target = Paths.get("output.txt");
            Files.copy(in, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
