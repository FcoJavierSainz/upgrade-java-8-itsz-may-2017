package modulo1;

/**
 * Created by JavierSainz on 5/5/17.
 */
public class MyAutoClosable implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new Exception("Close");
    }

    /*
    public static void main(String[] args) {
        try (MyAutoClosable c = new MyAutoClosable()) {
            throw new IllegalStateException("turkeys ran off");
        } catch (IllegalStateException e) {
            System.out.println("caught: " + e.getMessage());
            for (Throwable t : e.getSuppressed())
                System.out.println(t.getMessage());
        }
    }*/
}
