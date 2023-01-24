import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GeneralConfigs {
    public static boolean executed = false;
    public static String wordToGuess = null;
    public static int tries = 0;
    public static List<String> usedWords = new ArrayList();

    public static void allowedWords (String inputWord) {

        String[] legalWords = null;

        try {
            BufferedReader availableWords = new BufferedReader(new FileReader("Words.txt"));
            legalWords = availableWords.readLine().toLowerCase().split(" ");
        }
        catch (IOException e) {
            System.out.println(Colors.RED+"(!) error! dm Slzwascoded#0771 to solve the problem. - 1"+ Colors.RESET);
            System.exit(0);
        }

        Configs(legalWords, inputWord);
    }

    public static void Configs(String[] legalWords, String inputWord) {

        if (!executed) {

            int random = (int) (Math.random() * legalWords.length);

            wordToGuess = legalWords[random];
            tries = 5;
            executed = true;

            wordChecker(legalWords, inputWord, wordToGuess, tries);

        }
        wordChecker(legalWords,inputWord,wordToGuess,tries);
    }


    public static void wordChecker(String[] legalWords, String inputWord,String wordToGuess, int tries) {

        for (String i : usedWords) {

            if (inputWord.matches(i)) {
                System.out.println("\n"+ Colors.WHITE+"(!) You already used this word, try another"+ Colors.RESET);
                Input.input();
            }

        }

        for (String legalWord : legalWords) {

            if (inputWord.matches(legalWord)) {
                usedWords.add(inputWord);
                Result.resultCheck(wordToGuess,inputWord,tries);
            }

        }

        System.out.println(Colors.WHITE+"(!) Type a real Word"+Colors.RESET);
        System.out.println(Colors.PURPLE+"(?) couldn't find word and think it should be added? dm Slzwascoded#0771."+ Colors.RESET);
        Input.input();
    }
}
