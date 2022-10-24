package exercise;

import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage database) {
        Set<String> databaseKey = new HashSet<>(database.toMap().keySet());

        databaseKey
                .stream()
                .forEach(key -> {
                    database.set(
                            database.get(key, "default"),
                            key
                    );
                    database.unset(key);
                });
    }
}
// END
