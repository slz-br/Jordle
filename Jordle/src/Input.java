import java.util.Scanner;

public class Input {
    public static void input() {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n%s>%s Type a word:", Colors.PURPLE, Colors.RESET);
        String inputWord = scanner.next().toLowerCase();

        if(inputWord.length() != 4) {
            System.out.println(Colors.WHITE+"(!) Type a word with 4 letters"+Colors.RESET);
            input();
        }
        GeneralConfigs.allowedWords(inputWord);

    }
}
