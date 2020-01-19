import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private AtomicInteger cnt;
    public Counter(int init) {
        cnt = new AtomicInteger(init);
    }
    public void increment() {
        cnt.incrementAndGet();
    }
    public void decrement() {
        cnt.decrementAndGet();
    }
    public int value() {
        return cnt.get();
    }
}
