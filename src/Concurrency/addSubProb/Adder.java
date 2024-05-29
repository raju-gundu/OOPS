package Concurrency.addSubProb;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Count count;
    public Adder(Count count1){
        this.count=count1;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            count.value.addAndGet(i);

        }
    }
}
