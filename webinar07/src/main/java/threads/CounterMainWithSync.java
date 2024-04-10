package threads;

import java.util.ArrayList;
import java.util.List;

public class CounterMainWithSync {

    public static void main(String[] args) {
        Counter counter = new Counter();

        List<Thread> threads = new ArrayList<>();

        for (int k = 0; k < 10000; k++) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (counter) {
                    int i = counter.getCounter() + 1;
                    counter.setCounter(i);
                }
            });
            threads.add(thread);
        }

        for (Thread thread: threads) {
            thread.start();
        }

        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("counter = " + counter.getCounter());
    }

}
