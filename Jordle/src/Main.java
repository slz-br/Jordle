public class Main {
    public static void main(String[] args) {

        // Instructions Message
        System.out.println("==================== Jordle 2 ====================");
        System.out.println("- You have 5 guesses to find the correct word");
        System.out.println("- The word contains 4 letters.");
        System.out.printf("%s %s means that you guessed the letter and place",Colors.GREEN_BACKGROUND,Colors.RESET);
        System.out.printf("\n%s %s means that you only guessed the letter right",Colors.YELLOW_BACKGROUND,Colors.RESET);
        System.out.printf("\n%s %s means that the word doesn't have this letter",Colors.BLACK_BACKGROUND,Colors.RESET);
        System.out.print("\n==================================================");

        // Calling the method to receive the word(input) of the user
        Input.input();

    }
}