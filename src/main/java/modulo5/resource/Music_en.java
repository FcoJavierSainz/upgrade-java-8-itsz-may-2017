package modulo5.resource;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class Music_en extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"hello", "Hello"},
                {"artist", "Artist"}
        };
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        ResourceBundle rb = ResourceBundle.getBundle("modulo5.resource.Music", Locale.FRENCH);
        System.out.println(rb.getString("artist"));
    }
}
