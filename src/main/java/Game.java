public class Game {
    public String question;

    public GuessResult guess(String guessNumber) {
        assertIllegalArgumnet(guessNumber);

        if (guessNumber.equals(question)) {
            return new GuessResult(true);
        }

        return getResult(guessNumber);
    }

    private GuessResult getResult(String guessNumber) {
        GuessResult result = new GuessResult(false);

        for (int i = 0; i < guessNumber.length(); i++) {
            char guessChar = guessNumber.charAt(i);
            if (question.charAt(i) == guessChar) {
                result.setStrikes(result.getStrikes() + 1);
            } else if (question.indexOf(guessChar) != -1) {
                result.setBalls(result.getBalls() + 1);
            }
        }

        return result;
    }

    private void assertIllegalArgumnet(String guessNumber) {
        if (guessNumber == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        if (guessNumber.length() != 3) {
            throw new IllegalArgumentException("Input length must be 3 characters");
        }

        for (char number : guessNumber.toCharArray()) {
            if (number < '0' || number > '9') {
                throw new IllegalArgumentException("Input must contain only digits");
            }
        }

        if (isDuplicatedNumber(guessNumber)) {
            throw new IllegalArgumentException("Input must not contain duplicate digits");
        }
    }

    private boolean isDuplicatedNumber(String guessNumber) {
        return guessNumber.charAt(0) == guessNumber.charAt(1) ||
                guessNumber.charAt(0) == guessNumber.charAt(2) ||
                guessNumber.charAt(1) == guessNumber.charAt(2);
    }
}
