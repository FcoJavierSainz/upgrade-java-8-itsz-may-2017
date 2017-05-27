package modulo5.resource;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class HandleVariables {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("variable");
        String format = rb.getString("helloByName");
        String formatted = MessageFormat.format(format, "Javier");
        System.out.print(formatted);
    }
}
