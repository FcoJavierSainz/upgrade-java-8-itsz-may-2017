package modulo4;

import java.util.concurrent.*;

/**
 * Created by JavierSainz on 5/20/17.
 */
public class Compile {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            //service.submit(() -> {Thread.sleep(1000); return null;});
            //service.submit(() -> {Thread.sleep(1000);});
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
