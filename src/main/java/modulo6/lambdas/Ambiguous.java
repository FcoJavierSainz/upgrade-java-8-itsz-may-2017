package modulo6.lambdas;

/**
 * Created by JavierSainz on 6/3/17.
 */
interface Executable {
    void execute();
}
public class Ambiguous {
    static void methodA(Runnable r) {

    }

    static void methodA(Executable r) {

    }

    public static void main(String[] args) {
        //methodA(() -> System.out.println());
    }
}
