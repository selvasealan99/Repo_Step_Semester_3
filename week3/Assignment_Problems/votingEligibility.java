package week3.assignments;

import java.util.Scanner;

public class votingEligibility {
    static Scanner sc=new Scanner(System.in);
    void CheckVotingEligibility(int age){
        System.out.println("Enter your age");
        age=sc.nextInt();
        boolean isEligible=age>=18;
        if (isEligible){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You are not eligible");
        }
    }
    public static void main(String[] args) {
        votingEligibility v=new votingEligibility();
        v.CheckVotingEligibility(20);
    }
}
