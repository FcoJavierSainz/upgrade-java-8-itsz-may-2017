package modulo6.lambdas;

/**
 * Created by JavierSainz on 6/3/17.
 */
public class TestLambdas {


    static int x;
    public static void main(String[] args) {
        TwoParameters lambda = (x, y) -> System.out.println(x + " " + y );
        lambda.test("Hola", 6);
    }
}
