package week3;

import java.util.Scanner;

public class findingArmstrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int origNumber=num;
        int sum=0,digit;
        while(num!=0)
        {
            digit=num%10;
            sum=sum+(digit*digit*digit);
            num=num/10;
        }
        if(origNumber==sum)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}
