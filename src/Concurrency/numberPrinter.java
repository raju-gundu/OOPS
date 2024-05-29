package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class numberPrinter implements Runnable {
    int num;
    public numberPrinter(int i) {
        num = i;
    }

    @Override
    public void run() {

        System.out.println(num+" "+Thread.currentThread().getName());
    }
}
