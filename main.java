import java.util.*;

public class main {
    public static void main(String[] args) {
        String digits = "0123456789";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "*&$#";
        String allChars = digits + letters + specialCharacters;

        // Count total # of possible passwords
        int totalChoices = allChars.length();
        long totalPasswords = 10 * (long) Math.pow(totalChoices, 7);
        System.out.println("Total possible passwords: " + totalPasswords);

        // Create random generator
        Random rand = new Random();

        // Picks a digit for the first char
        String password = "" + digits.charAt(rand.nextInt(digits.length()));

        for (int i = 0; i < 7; i++) {
            int randomIndex = rand.nextInt(totalChoices);
            char nextChar = allChars.charAt(randomIndex);
            password += nextChar; // add character to string
        }

        System.out.println("Randomly generated password: " + password);
    }
}