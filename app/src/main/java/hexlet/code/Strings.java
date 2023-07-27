package hexlet.code;

public class Strings {
    private static String chooseGameText = "Please enter the game number and press Enter.";
    private static String chosenText = "Your choice: ";
    private static String welcomeText = "Welcome to the Brain Games!";
    private static String inputNameText = "May I have your name? ";
    private static String stringQuestionText = "Question: %s";
    private static String numberQuestionText = "Question: %d";
    private static String answerText = "Your answer: ";
    private static String correctText = "Correct!";
    private static String congratulationsText = "Congratulations, %s!";
    private static String wrongSchemeText = "'%s' is wrong answer ;(. Correct answer was '%s'";
    private static String tryAgainText = "Let's try again, %s!";
    private static String evenTaskTextText = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String calcTaskText = "What is the result of the expression?";
    private static String gcdTaskText = "Find the greatest common divisor of given numbers.";
    private static String progressionTaskText = "What number is missing in the progression?";
    private static String primeTaskText = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String getChooseGameText() {
        return chooseGameText;
    }

    public static String getWelcomeText() {
        return welcomeText;
    }

    public static String getInputNameText() {
        return inputNameText;
    }

    public static String getChosenText() {
        return chosenText;
    }

    public static String getCongratulationsText() {
        return congratulationsText;
    }

    public static String getEvenTaskText() {
        return evenTaskTextText;
    }

    public static String getNumberQuestionText() {
        return numberQuestionText;
    }

    public static String getStringQuestionText() {
        return stringQuestionText;
    }

    public static String getCalcTaskText() {
        return calcTaskText;
    }

    public static String getGCDTaskText() {
        return gcdTaskText;
    }

    public static String getProgressionTaskText() {
        return progressionTaskText;
    }

    public static String getPrimeTaskText() {
        return primeTaskText;
    }

    public static String getAnswerText() {
        return answerText;
    }

    public static String getCorrectText() {
        return correctText;
    }

    public static String getWrongSchemeText() {
        return wrongSchemeText;
    }

    public static String getTryAgainText() {
        return tryAgainText;
    }
}
