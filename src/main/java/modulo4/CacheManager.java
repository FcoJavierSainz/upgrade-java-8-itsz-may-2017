package modulo4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JavierSainz on 5/18/17.
 */
public class CacheManager {
    private Map<String, Object> cache = new HashMap<String, Object>();

    public synchronized void put(String key, String value) {
        cache.put(key, value);
    }

    public synchronized Object get(String key) {
        return cache.get(key);
    }

    public synchronized void dumpRemoveAll() {
        for (String key :
                cache.keySet()) {
            cache.remove(key);
        }
    }

    public static void main(String[] args) {
        CacheManager cacheManager = new CacheManager();
        cacheManager.put("key1", "value1");
        cacheManager.put("key2", "value2");
        cacheManager.put("key3", "value3");
        cacheManager.dumpRemoveAll();
    }
}