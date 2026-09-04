package week4;

import java.util.Arrays;

public class rotateArray {
    public static int[] RotateArray(int[] nums, int k){
        k=k%nums.length;
        int[] newArray=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            newArray[(i + k) % nums.length]=nums[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int k =3;
        System.out.println("Before Rotate Array");
        System.out.println(Arrays.toString(arr1));

        int[] newArray=RotateArray(arr1,k);
        for (int j : newArray) {
            System.out.print(j + " ");
        }
    }
}
