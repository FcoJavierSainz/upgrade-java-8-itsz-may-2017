package modulo1;

/**
 * Created by JavierSainz on 5/5/17.
 */
public class Test {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("invalid class");
        } catch (ReflectiveOperationException e) {
            System.out.println("Manejando la excepción");
            e.printStackTrace();
        }
    }
}