package week7;

class Scorecard {
    private final boolean[] results;
    private int count;

    public Scorecard(int questions) {
        results = new boolean[questions];
        count = 0;
    }

    public void recordAnswer(boolean correct) {
        if (count < results.length) {
            results[count] = correct;
            count++;
        }
    }

    public int getScore() {
        int score = 0;

        for (int i = 0; i < count; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }
}
