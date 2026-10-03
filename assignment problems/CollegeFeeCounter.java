package week9.assignments;

import java.util.*;

abstract class Student {
    static final double TRANSPORT_FEE = 12000;
    String name;

    Student(String name) {
        this.name = name;
    }

    abstract double tuition();

    double totalFee() {
        return tuition();
    }
}

interface BusUser {
    double transportFee();
}

class DayScholar extends Student implements BusUser {
    DayScholar(String name) {
        super(name);
    }

    double tuition() {
        return 40000;
    }

    public double transportFee() {
        return TRANSPORT_FEE;
    }

    double totalFee() {
        return tuition() + transportFee();
    }
}

class Hosteller extends Student {
    Hosteller(String name) {
        super(name);
    }

    double tuition() {
        return 40000;
    }

    double totalFee() {
        return tuition() + 60000;
    }
}

class Scholar extends Student implements BusUser {
    Scholar(String name) {
        super(name);
    }

    double tuition() {
        return 20000;
    }

    public double transportFee() {
        return TRANSPORT_FEE;
    }

    double totalFee() {
        return tuition() + transportFee();
    }
}

public class CollegeFeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            Student s;

            if (type.equals("DAY_SCHOLAR")) {
                s = new DayScholar(name);
            } else if (type.equals("HOSTELLER")) {
                s = new Hosteller(name);
            } else {
                s = new Scholar(name);
            }

            double fee = s.totalFee();
            total += fee;

            System.out.printf("%s: %.2f%n", name, fee);
        }

        System.out.printf("Total Collected: %.2f%n", total);
    }
}
