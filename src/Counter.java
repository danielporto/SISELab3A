class Counter {
    private int cnt = 0;
    public Counter(int init) {
        cnt = init;
    }
    public synchronized void increment() {
        cnt++;
    }
    public synchronized void decrement() {
        cnt--;
    }
    public synchronized int value() {
        return cnt;
    }
}
