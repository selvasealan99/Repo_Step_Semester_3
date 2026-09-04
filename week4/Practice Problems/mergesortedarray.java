package week4;

import java.util.Arrays;
import java.util.Scanner;

public class mergesortedarray {
    int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int i=0;
        int j=0;
        int k=0;

        int[] result = new int[arr1.length+arr2.length];

        while ((i<arr1.length)&&(j<arr2.length)){
            if (arr1[i]<arr2[j])
            {
                result[k]=arr1[i];
                i++;
            }
            else {
                result[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i<arr1.length)
        {
            result[k]=arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length)
        {
            result[k]=arr2[j];
            j++;
            k++;
        }
        return  result;
    }
    public static void main(String[] args) {
        mergesortedarray obj = new mergesortedarray();
        int[] ar1={1,3,5};
        int[] ar2={2,4,6};
        int[] result=obj.mergeSortedArray(ar1,ar2);
        System.out.println(Arrays.toString(result));

    }
}
