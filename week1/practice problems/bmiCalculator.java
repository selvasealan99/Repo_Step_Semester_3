package Step.practice;

public class bmiCalculator {

    static String getBmiStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("Person\tHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);

            System.out.printf(
                    "Person %d\t%.2f\t%.2f\t%.2f\t%s%n",
                    i + 1,
                    heights[i],
                    weights[i],
                    bmi,
                    getBmiStatus(bmi)
            );
        }
    }

    public static void main(String[] args) {
        double[] heights = {
                1.75, 1.60, 1.80, 1.65, 1.70,
                1.55, 1.82, 1.68, 1.73, 1.78
        };

        double[] weights = {
                70, 90, 80, 75, 60,
                50, 95, 68, 85, 100
        };

        printWellnessReport(heights, weights);
    }
}