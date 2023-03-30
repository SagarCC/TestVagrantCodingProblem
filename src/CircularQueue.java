public class CircularQueue {
    int n;
    int front;
    String[] queue;
    public CircularQueue(int n) {
        this.n = n;
        this.front = 0;
        this.queue = new String[n];
    }

    public void add(String songName) {
        this.front = (this.front+1)%n;
        this.queue[this.front] = songName;
    }

    //Get element at front of peek.
    public String peek() {
        return this.queue[this.front];
    }
}
