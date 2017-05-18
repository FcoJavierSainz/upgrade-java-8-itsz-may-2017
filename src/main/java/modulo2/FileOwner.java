package modulo2;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

/**
 * Created by JavierSainz on 5/12/17.
 */
public class FileOwner {
    public static void main(String[] args) throws IOException {
        UserPrincipal owner = FileSystems.getDefault().getUserPrincipalLookupService()
                .lookupPrincipalByName("JavierSainz");
        System.out.println(owner);
        try {
            // Read owner of file
            Path path = Paths.get("file1");
            System.out.println(Files.getOwner(path).getName());

            // Change owner of file
            owner = path.getFileSystem()
                    .getUserPrincipalLookupService().lookupPrincipalByName("root");
            Files.setOwner(path, owner);

            // Output the updated owner information
            System.out.println(Files.getOwner(path).getName());
        } catch (IOException e) {
            // Handle file I/O exception...
            e.printStackTrace();
        }
    }
}
