package week3;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int origNumber = n;
        int rnumb=0;
        while (n!=0) {
            int digit=n%10;
            rnumb=rnumb*10+digit;
            n=n/10;
        }
        if(rnumb==origNumber)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}
