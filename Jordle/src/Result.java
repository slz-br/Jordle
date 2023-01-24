public class Result {

    public static void resultCheck(String wordToGuess,String inputWord, int tries) {

        if (inputWord.equalsIgnoreCase(wordToGuess)) {
            System.out.printf("\n%s>%s You guessed the word!",Colors.PURPLE,Colors.RESET);
            System.out.printf("\nthere was %d guesses left\n %s\n",tries,wordToGuess);
            System.exit(0);
        }

        for (int i = 0 ; i<wordToGuess.length() ; i++) {
            
            if(inputWord.charAt(i) == wordToGuess.charAt(i)) {
                System.out.printf(Colors.GREEN_BACKGROUND+"%c"+Colors.RESET,inputWord.charAt(i));
                continue;
            }

            String inputWordCharAt = Character.toString(inputWord.charAt(i));

            if(wordToGuess.contains(inputWordCharAt)) {
                System.out.printf(Colors.YELLOW_BACKGROUND+"%c"+Colors.RESET, inputWord.charAt(i));
                continue;
            }

            System.out.printf(Colors.BLACK_BACKGROUND+"%c"+Colors.RESET, inputWord.charAt(i));
        }

        GeneralConfigs.tries--;
        if (GeneralConfigs.tries == 0) {

            System.out.println(Colors.RED+"\nGame Over"+Colors.RESET);
            System.out.printf("\nThe word was: \n%s", wordToGuess);
            System.exit(0);

        }
        System.out.printf("\nguesses left: %d", GeneralConfigs.tries);
        Input.input();
    }
}