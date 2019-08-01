package E83;

public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;


    public HangmanLogic(String word){ // KISSA

        this.word = word.toUpperCase(); // we right away say that word is equal to upper case words only
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int getNumberOfFaults(){

        return this.numberOfFaults;
    }

    public String getGuessedLetters(){
        return this.guessedLetters;
    }

    public int losingFaultAmount(){
        return 12;
    }

    public void guessLetter(String letter){ // "A"


       if(!guessedLetters.contains(letter)){ // the "letter" does not appear anywhere in guessedLetters

           if(!word.contains(letter)){ // the "letter" does not appear anywhere in the word
               numberOfFaults++; // so we increment number of faults
           }

           guessedLetters +=letter; // since the "letter doesn't appear anywhere in guessedLetter add it
       }
    }

    public String hiddenWord(){

        String hiddenW = "";
        String currL = "";

        for(int i = 0; i < this.word.length();i++){

            currL = "" + word.charAt(i);
            if(guessedLetters.contains(currL)){
                hiddenW += currL;

            }else{
                hiddenW+="-";
            }

        }

        return hiddenW;
    }

}
