package week8;

import java.util.*;

interface Question {
    double evaluate();
}

class MCQ implements Question {
    String correct, student;
    double points;

    MCQ(String correct, String student, double points) {
        this.correct = correct;
        this.student = student;
        this.points = points;
    }

    public double evaluate() {
        return correct.equalsIgnoreCase(student) ? points : 0;
    }
}

class TF implements Question {
    String correct, student;
    double points;

    TF(String correct, String student, double points) {
        this.correct = correct;
        this.student = student;
        this.points = points;
    }

    public double evaluate() {
        return correct.equalsIgnoreCase(student) ? points : 0;
    }
}

class Essay implements Question {
    String correct, student;
    double points;

    Essay(String correct, String student, double points) {
        this.correct = correct;
        this.student = student;
        this.points = points;
    }

    public double evaluate() {
        String[] keywords = correct.split(",");
        String answer = student.toLowerCase();

        int count = 0;

        for (String keyword : keywords) {
            if (answer.contains(keyword.trim().toLowerCase())) {
                count++;
            }
        }

        if (count >= 2)
            return points * 0.75;
        else if (count == 1)
            return points * 0.50;
        else
            return 0;
    }
}

public class ExamQuestionGrader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            List<String> parts = new ArrayList<>();

            java.util.regex.Matcher m =
                    java.util.regex.Pattern.compile("\"([^\"]*)\"|(\\S+)")
                            .matcher(line);

            while (m.find()) {
                if (m.group(1) != null)
                    parts.add(m.group(1));
                else
                    parts.add(m.group(2));
            }

            String type = parts.get(0);
            String correct = parts.get(2);
            String student = parts.get(3);
            double points = Double.parseDouble(parts.get(4));

            Question question;

            if (type.equals("MCQ"))
                question = new MCQ(correct, student, points);
            else if (type.equals("TF"))
                question = new TF(correct, student, points);
            else
                question = new Essay(correct, student, points);

            double score = question.evaluate();

            System.out.printf("%s: %.2f%n", type, score);
            total += score;
        }

        System.out.printf("Total Score: %.2f%n", total);
    }
}