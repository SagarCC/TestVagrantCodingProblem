import org.junit.Assert;
import org.junit.Test;

public class LeastRecentlyPlayedSongOfUserTest {

    @Test
    public void testSingleUserSongs() {
        // Capacity is 3.
        int n = 3;
        new LeastRecentlyPlayedSongOfUser(n);
        CircularQueue firstUserQueue = new CircularQueue(n);
        firstUserQueue.add("S1");
        firstUserQueue.add("S2");
        firstUserQueue.add("S3");
        firstUserQueue.add("S4");
        firstUserQueue.add("S5");
        LeastRecentlyPlayedSongOfUser.inMemoryStore.put("User1", firstUserQueue);
        // Last song will be S5.
        Assert.assertTrue(
                LeastRecentlyPlayedSongOfUser.inMemoryStore.get("User1").peek()=="S5");
    }

    @Test
    public void testMoreThanOneUserSongs() {
        // Capacity is 3.
        int n = 3;
        new LeastRecentlyPlayedSongOfUser(n);
        CircularQueue firstUserQueue = new CircularQueue(n);
        firstUserQueue.add("S1");
        firstUserQueue.add("S2");
        firstUserQueue.add("S3");
        firstUserQueue.add("S4");
        firstUserQueue.add("S5");

        CircularQueue secondUserQueue = new CircularQueue(n);
        secondUserQueue.add("S5");
        secondUserQueue.add("S4");
        secondUserQueue.add("S3");
        secondUserQueue.add("S1");
        secondUserQueue.add("S2");

        LeastRecentlyPlayedSongOfUser.inMemoryStore.put("User1", firstUserQueue);
        LeastRecentlyPlayedSongOfUser.inMemoryStore.put("User2", secondUserQueue);
        // Last song will be S5.
        Assert.assertTrue(
                LeastRecentlyPlayedSongOfUser.inMemoryStore.get("User1").peek()=="S5");
        Assert.assertTrue("S2".equals(
                LeastRecentlyPlayedSongOfUser.inMemoryStore.get("User2").peek()));
    }
}
