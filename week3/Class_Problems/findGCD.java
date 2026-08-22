package week3;

import java.util.Scanner;

public class findGCD {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        while (number2!=0)
        {
            int reminder=number1%number2;
            number1=number2;
            number2=reminder;
        }
        System.out.println("GCD = "+number1);
    }
}
