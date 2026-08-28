package week3.assignments;

import java.util.Scanner;

public class printdayname {
    Scanner sc=new Scanner(System.in);
    void printDayName(int dayNumber)
    {
        System.out.print("enter the day number");
        dayNumber=sc.nextInt();

        switch (dayNumber)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
    public static void main(String[] args) {
        printdayname p=new printdayname();
        p.printDayName(11);
    }
}
