package modulo2;

/**
 * Created by JavierSainz on 5/13/17.
 */

import java.io.IOException;
import java.nio.file.*;

public class WatchServiceSample {
    public static void main(String[] args) throws IOException {
        try (WatchService service = FileSystems.getDefault().newWatchService()) {

            // Register for events
            Path currentFolder = Paths.get(".");
            currentFolder.register(service, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);

            // Poll for events
            for (; ; ) {
                WatchKey key;
                try {
                    key = service.take();
                } catch (InterruptedException x) {
                    break;
                }

                // Retrieve events for key
                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    if (kind == StandardWatchEventKinds.OVERFLOW) {
                        continue;
                    }

                    // Process event
                    WatchEvent<Path> watchEvent = (WatchEvent<Path>) event;
                    Path path = watchEvent.context();
                    System.out.println("[eventType=" + kind
                            + ", path=" + path.getFileName() + "]");
                }

                // Remember to always reset event key
                if (!key.reset()) {
                    break;
                }
            }
        }
    }
}