package modulo6.lambdas;

/**
 * Created by JavierSainz on 6/3/17.
 */
interface Gorilla {
    String move();
}

public class GorillaFamily {
    String walk = "walk";

    void everyonePlay(boolean baby) {
        String approach = "amble";
        // approach = "run";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);
    }

    void play(Gorilla g) {
        System.out.println(g.move());
    }
}

