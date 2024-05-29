package Concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        List<Integer> list = Arrays.asList(9,6,7,4,3,5,84);
        mergeSort mergeSort = new mergeSort(list,executor);
       Future<List<Integer>> k = executor.submit(mergeSort);
       System.out.println(k.get());
       System.out.println("aaaaaaaaa");
    }
}
