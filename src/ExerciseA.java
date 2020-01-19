public class ExerciseA {
    // update the number of interactions
    public static final int NUM_ITER = 1000;

    static class MyThread extends Thread {
        private String name;
        private Counter counter;
        // update the constructor to use a counter
        MyThread (String name, Counter c) {
            this.name = name;
            this.counter = c;
        }

        void writeHello() {
            System.out.println("Hello " + name);
        }

        public void run () {
            // update the loop
            for (int i = 0; i < NUM_ITER; i++) {
                //writeHello();
                counter.increment();
            }
        }
    }

    public static void main (String[] args) throws Exception {
        // initialize a counter
        Counter myCounter = new Counter(0);
        // fix the calls to the updated constructor
        Thread a = new MyThread("A", myCounter);
        Thread b = new MyThread("B", myCounter);

        a.start();
        b.start();

        a.join();
        b.join();
        // output the final counter value
        System.out.println(myCounter.value());
    }
}
