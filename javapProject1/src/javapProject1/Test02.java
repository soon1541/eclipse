package javapProject1;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String ciphertext = scanner.nextLine();

        
        String key = scanner.nextLine();

        
        String originalText = decrypt(ciphertext, key);

        
        System.out.println(originalText);
    }

    public static String decrypt(String ciphertext, String key) {
        StringBuilder result = new StringBuilder();
        int keyIndex = 0;

        for (char c : ciphertext.toCharArray()) {
            if (keyIndex < key.length() && c == key.charAt(keyIndex)) {
                keyIndex++;
            } else {
                result.append(c);
            }

            if (keyIndex == key.length()) {
                keyIndex = 0;
            }
        }

        return result.toString();
    }
}