package week3.assignments;

import java.util.Scanner;

public class classifynumber {
    Scanner sc=new Scanner(System.in);
    void classifyNumber(int number){
        System.out.println("enter a number");
        number=sc.nextInt();
        if (number>0)
            System.out.println("POSITIVE");
        else if (number<0)
            System.out.println("NEGATIVE");
        else
            System.out.println("ZERO");

    }
    public static void main(String[] args) {
        classifynumber ob=new classifynumber();
        ob.classifyNumber(20);
    }
}
