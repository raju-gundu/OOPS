package Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class mergeSort implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService executor;

    public mergeSort(List<Integer> list, ExecutorService executor1) {
        arrayToSort = list;
        executor = executor1;

    }
    @Override
    public List<Integer> call() throws Exception {
        if (arrayToSort.size()<=1) {
            return arrayToSort;
        }
        else {
            int middle = arrayToSort.size()/2;
            List<Integer> leftArray = new ArrayList<>();
            List<Integer> rightArray = new ArrayList<>();

            for (int i = 0; i < middle; i++) {
                leftArray.add(arrayToSort.get(i));
            }
            for (int i = middle; i < arrayToSort.size(); i++) {
                rightArray.add(arrayToSort.get(i));
            }

            mergeSort leftSorter = new mergeSort(leftArray,executor);
            mergeSort rightSorter = new mergeSort(rightArray,executor);

/*            List<Integer> leftSortedArray = leftSorter.call();
            List<Integer> rightSortedArray = rightSorter.call();*/
            Future<List<Integer>> leftSortedArray = executor.submit(leftSorter);
            Future<List<Integer>> rightSortedArray = executor.submit(rightSorter);
            List<Integer> mergedArray = new ArrayList<>();

            int i=0,j=0;
            while (i<leftSortedArray.get().size() && j<rightSortedArray.get().size()){
                if(leftSortedArray.get().get(i)<=rightSortedArray.get().get(j)){
                    mergedArray.add(leftSortedArray.get().get(i));
                    i++;
                }
                else {
                    mergedArray.add(rightSortedArray.get().get(j));
                    j++;
                }
            }
            while (i<leftSortedArray.get().size()){
                mergedArray.add(leftSortedArray.get().get(i));
                i++;
            }
            while (j<rightSortedArray.get().size()){
                mergedArray.add(rightSortedArray.get().get(j));
                j++;
            }
            return mergedArray;
        }
    }

}
