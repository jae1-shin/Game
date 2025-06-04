public class Game {
    public void guess(String guessNumber) {
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

        if (guessNumber.charAt(0) == guessNumber.charAt(1) ||
            guessNumber.charAt(0) == guessNumber.charAt(2) ||
            guessNumber.charAt(1) == guessNumber.charAt(2)) {
            throw new IllegalArgumentException("Input must not contain duplicate digits");
        }
    }
}
