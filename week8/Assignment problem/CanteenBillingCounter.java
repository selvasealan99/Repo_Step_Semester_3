package week8.assignments;

import java.util.*;

interface Customer {
    double calculateAmount(double amount);
}

class Student implements Customer {
    public double calculateAmount(double amount) {
        return amount * 0.90;
    }
}

class Staff implements Customer {
    public double calculateAmount(double amount) {
        return amount * 0.95;
    }
}

class Guest implements Customer {
    public double calculateAmount(double amount) {
        return amount + 10;
    }
}

public class CanteenBillingCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();

            Customer customer;

            if (type.equals("STUDENT"))
                customer = new Student();
            else if (type.equals("STAFF"))
                customer = new Staff();
            else
                customer = new Guest();

            double result = customer.calculateAmount(amount);

            System.out.printf("%s: %.2f%n", type, result);
            total += result;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
