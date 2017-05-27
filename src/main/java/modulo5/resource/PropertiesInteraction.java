package modulo5.resource;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class PropertiesInteraction {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        ResourceBundle rb = ResourceBundle.getBundle("Music");
        Properties props = toProperties(rb);
        System.out.println(props.getProperty("hello"));
        System.out.println(props.getProperty("hello2", "default"));
        System.out.println(props.get("artist"));
    }

    public static Properties toProperties(ResourceBundle rb) {
        Properties props = new Properties();
        rb.keySet().stream()
                .forEach(k -> props.put(k, rb.getString(k)));
        return props;
    }
}
