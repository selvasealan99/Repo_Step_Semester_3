package week8;

import java.util.*;

interface Transport {
    double calculateFare();
}

class Bus implements Transport {
    double distance;

    Bus(double distance) {
        this.distance = distance;
    }

    public double calculateFare() {
        return Math.min(2 + (0.10 * distance), 10);
    }
}

class Train implements Transport {
    double distance;

    Train(double distance) {
        this.distance = distance;
    }

    public double calculateFare() {
        return 3 + (0.15 * distance);
    }
}

class Metro implements Transport {
    double distance, peakFactor;

    Metro(double distance, double peakFactor) {
        this.distance = distance;
        this.peakFactor = peakFactor;
    }

    public double calculateFare() {
        return (1.50 + (0.20 * distance)) * peakFactor;
    }
}

public class PublicTtansportFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            double distance = sc.nextDouble();

            Transport transport;

            if (type.equals("BUS"))
                transport = new Bus(distance);
            else if (type.equals("TRAIN"))
                transport = new Train(distance);
            else {
                double peakFactor = sc.nextDouble();
                transport = new Metro(distance, peakFactor);
            }

            double fare = transport.calculateFare();

            System.out.printf("%s: %.2f%n", type, fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
