package modulo4;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by JavierSainz on 5/18/17.
 */
public class CacheManager {
    private Map<String, Object> cache = new ConcurrentHashMap<>();

    public void put(String key, String value) {
        cache.put(key, value);
    }

    public Object get(String key) {
        return cache.get(key);
    }

    public void dumpRemoveAll() {
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
        System.out.println(cacheManager.cache);
    }
}