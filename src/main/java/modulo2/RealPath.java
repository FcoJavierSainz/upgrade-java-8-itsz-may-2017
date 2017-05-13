package modulo2;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * Created by JavierSainz on 5/11/17.
 */
public class RealPath {
    public static void main(String[] args) {
        try {
            System.out.println(Paths.get("/zebra/food.source").toRealPath());

            System.out.println(Paths.get(".././food.txt").toRealPath());
        } catch (IOException e) {
            // Handle file I/O exception...
            System.out.println(e.getMessage());
        }
    }
}
