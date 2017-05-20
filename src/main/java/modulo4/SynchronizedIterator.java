package modulo4;

import java.util.*;

/**
 * Created by JavierSainz on 5/18/17.
 */
public class SynchronizedIterator {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(
                new ArrayList<>(Arrays.asList(4,3,52)));
        synchronized(list) {
            for(int data: list)
                System.out.print(data+" ");
        }

        Map<String, Object> foodData = new HashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        Map<String,Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
        for(String key: synchronizedFoodData.keySet())
            synchronizedFoodData.remove(key);
    }
}
