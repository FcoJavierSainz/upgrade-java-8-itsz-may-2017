package modulo5.resource;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class FormatProperties {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("modulo5.resource.Format",
                Locale.getDefault());
        rb.keySet().forEach(key ->
                System.out.println(rb.getString(key)));
    }
}
