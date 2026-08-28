package week3.assignments;

import java.util.Scanner;

public class printNumbers {
    static Scanner sc=new Scanner(System.in);
    void printNumbersUpToN(int N){
        for (int i=1;i<=N;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printNumbers p=new printNumbers();
        System.out.print("Enter N :");
        int N = sc.nextInt();
        p.printNumbersUpToN(N);
    }
}
