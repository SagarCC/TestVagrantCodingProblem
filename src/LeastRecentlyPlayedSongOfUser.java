import java.util.HashMap;

public class LeastRecentlyPlayedSongOfUser extends CircularQueue {
    public static HashMap<String, CircularQueue> inMemoryStore;
    public LeastRecentlyPlayedSongOfUser(int n) {
        super(n);
        inMemoryStore = new HashMap<>();
    }

}
