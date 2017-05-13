package modulo1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/5/17.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        try {
            Class clazz = Class.forName("invalid class");
        } catch (ReflectiveOperationException e) {
            System.out.println("Manejando la excepción");
            e.printStackTrace();
        }
        Path path = Paths.get("");
        final Path path1 = Paths.get("/cats/../panther");
        final Path path2 = Paths.get("food");
        System.out.println(path1.resolve(path2));

        // out -> /cats/../panther/food


    }

}