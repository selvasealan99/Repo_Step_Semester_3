package week5.assignments;

import java.util.Arrays;

public class TeamScoreMultiplier {


        static void applyMultipliers(double[] playerScores) {

            playerScores[1] =
                    playerScores[1] * 2;

            playerScores[3] =
                    playerScores[3] * 1.5;
        }

        public static void main(String[] args) {

            double[] scores = {40, 55, 30, 62};

            applyMultipliers(scores);

            System.out.println(Arrays.toString(scores));
        }
    }
