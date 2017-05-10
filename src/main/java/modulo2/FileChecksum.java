package modulo2;

import javax.xml.bind.DatatypeConverter;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/**
 * Created by JavierSainz on 5/6/17.
 */
public class FileChecksum {
    Path path;
    String MD5Checksum;

    public FileChecksum(Path path) {
        this.path = path;
    }

    public byte[] createChecksum() throws
            Exception {
        InputStream fis = Files.newInputStream(path);

        byte[] buffer = new byte[8192];
        MessageDigest complete = MessageDigest.getInstance("MD5");
        int numRead;
        do {
            numRead = fis.read(buffer);
            if (numRead > 0) {
                complete.update(buffer, 0, numRead);
            }
        } while (numRead != -1);
        fis.close();
        return complete.digest();
    }

    // see this How-to for a faster way to convert
    // a byte array to a HEX string
    public String getMD5Checksum(String filename) throws Exception {
        if (MD5Checksum != null) {
            return MD5Checksum;
        }
        byte[] b = createChecksum();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < b.length; i++) {
            result.append(Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1));
        }
        MD5Checksum = result.toString();
        return MD5Checksum;
    }

    public String getMD5ChecksumV2(String filename) throws Exception {
        if (MD5Checksum != null) {
            return MD5Checksum;
        }
        byte[] buffer = new byte[8192];
        MessageDigest md = MessageDigest.getInstance("MD5");
        try (InputStream is = Files.newInputStream(path);
             DigestInputStream dis = new DigestInputStream(is, md)) {
            while (dis.read(buffer) != -1) ;
        }
        MD5Checksum = DatatypeConverter.printHexBinary(md.digest());
        return MD5Checksum;
    }
}
