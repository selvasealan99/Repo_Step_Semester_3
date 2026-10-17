package week10;

import java.util.Arrays;

public class Arrayreversal {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44};
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
