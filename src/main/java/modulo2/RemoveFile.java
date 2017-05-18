package modulo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class RemoveFile {
    public static void main(String[] args) throws IOException, InterruptedException {
        final Path file = Paths.get("file3");
        Files.createFile(file);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try (InputStream i = new FileInputStream(file.toFile())) {
                    Thread.sleep(10000);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread.sleep(2000);
        Files.delete(file);
    }
}
