package week4;

import java.util.Scanner;

public class containsDuplicate {
    static Scanner sc = new Scanner(System.in);
    boolean containsduplicate(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        containsDuplicate obj = new containsDuplicate();
        System.out.println("enter elements of an array");
        int[] arr=new int[4];
        for (int i=0;i<4;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.containsduplicate(arr));
    }
}

