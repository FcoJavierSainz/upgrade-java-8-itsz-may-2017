package modulo6.interfaces;

import java.util.function.Supplier;

/**
 * Created by JavierSainz on 6/3/17.
 */
public class SupplierTest {
    public static void main(String[] args) {
        String t = "One"; // final???
        Supplier<String> supplierStr = new Supplier<String>() {
            @Override
            public String get() {
                return t.toUpperCase();
            }
        };

        System.out.println(supplierStr.get());

        supplierStr = () -> t.toUpperCase();
        System.out.println(supplierStr.get());
    }
}
