package E83;

public class Main {

    public static void main(String[] args) {

        HangmanLogic l = new HangmanLogic("Mohamed");

        System.out.println("word is: "+l.hiddenWord());

        System.out.println("guessing: A, D, S, F, D");
        l.guessLetter("M");
        l.guessLetter("S");
        l.guessLetter("D");
        l.guessLetter("E");
        l.guessLetter("M");
        System.out.println("guessed letters: "+l.getGuessedLetters());
        System.out.println("number of faults: "+l.getNumberOfFaults());
        System.out.println("word now: "+l.hiddenWord());
    }
}
