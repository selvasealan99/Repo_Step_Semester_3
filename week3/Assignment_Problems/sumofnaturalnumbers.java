package week3.assignments;

import java.util.Scanner;

public class sumofnaturalnumbers {
    static Scanner sc=new Scanner(System.in);
    void sumOfNaturalNumbers(int n)
    {

        int counter=1;
        int sum=0;
        while (counter<=n)
        {
            sum+=counter;
            counter++;
        }
        System.out.println("The sum of the natural numbers is "+sum);
    }
    public static void main(String[] args) {
        sumofnaturalnumbers ob=new sumofnaturalnumbers();
        System.out.print("enter the number");
        int n=sc.nextInt();
        ob.sumOfNaturalNumbers(n);
    }
}
