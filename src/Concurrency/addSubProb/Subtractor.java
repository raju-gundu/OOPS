package Concurrency.addSubProb;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count count;
    Lock lock;
    public Subtractor(Count count1) {
        count = count1;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            count.value.addAndGet(-i);

        }
    }
}
