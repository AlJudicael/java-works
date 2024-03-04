/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordgenerator;

/**
 *
 * @author user
 */
import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

    public static void main(String[] args) {
        int length = 12; 
        boolean includeLowercase = true;
        boolean includeUppercase = true;
        boolean includeNumbers = true;
        boolean includeSpecialChars = true;

        
        String password = generatePassword(length, includeLowercase, includeUppercase, includeNumbers, includeSpecialChars);

        
        System.out.println("Generated Password: " + password);
    }

    
    public static String generatePassword(int length, boolean includeLowercase, boolean includeUppercase,
                                           boolean includeNumbers, boolean includeSpecialChars) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

    
        String characters = "";
        if (includeLowercase) {
            characters += LOWERCASE_CHARACTERS;
        }
        if (includeUppercase) {
            characters += UPPERCASE_CHARACTERS;
        }
        if (includeNumbers) {
            characters += NUMBERS;
        }
        if (includeSpecialChars) {
            characters += SPECIAL_CHARACTERS;
        }

            for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }
}
