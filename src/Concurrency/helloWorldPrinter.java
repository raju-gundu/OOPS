package Concurrency;

import java.util.concurrent.ThreadPoolExecutor;

class helloWorldPrinter implements Runnable {
    int print_n;
    public helloWorldPrinter(int i) {
        print_n=i;
    }
    @Override
    public void run() {
            System.out.println(print_n+" "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            helloWorldPrinter helloWorldPrinter = new helloWorldPrinter(i+1);
            Thread thread = new Thread(helloWorldPrinter);
            thread.start();
        }
    }
}
