public class GuessResult {
    private boolean solved;
    private int strikes;
    private int balls;

    public GuessResult(boolean solved) {
        this.solved = solved;

        if (solved) {
            this.strikes = 3;
            this.balls = 0;
        } else {
            this.strikes = 0;
            this.balls = 0;
        }
    }

    public boolean isSolved() {
        return solved;
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }
}
