package pkg2;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int arr[] = {9,5,7,8,7,9,8,2,0,7};
        double avg[] = new double[arr.length/2];
        Arrays.sort(arr);
        int j=0,k=arr.length-1,n=0;
        while(j<k){
            avg[n] = ((double) (arr[j] + arr[k]) /2);
            j++;n++;k--;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i <avg.length; i++) {
                System.out.print(avg[i]+" ");
        }
//        System.out.println(();
    }
}
