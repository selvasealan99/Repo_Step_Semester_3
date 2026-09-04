package week4;

import java.util.Arrays;
import java.util.Scanner;

public class twoSum {
    static Scanner sc = new Scanner(System.in);
    int[] twoSums(int[] arr, int target) {
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.print("Please enter the target number");
        int target =sc.nextInt();

        int[] arr=new int[4];
        System.out.println("please enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        twoSum ts = new twoSum();
        int[] result =ts.twoSums(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
