import java.util.Scanner;

public class SpoonerismGenerator {

    public static String getWord(Scanner scanner, int wordNumber) {
        System.out.print("Word " + wordNumber + ": ");
        return scanner.nextLine().trim();
    }

    public static int vowelIndex(String word) {
        word = word.toLowerCase();
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;
    }

    public static String swapConsonants(String word1, String word2) {
        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 == -1 || vowelIndex2 == -1 || vowelIndex1 == 0 || vowelIndex2 == 0) {
            return null;  
        }

        String prefix1 = word1.substring(0, vowelIndex1);
        String suffix1 = word1.substring(vowelIndex1);
        String prefix2 = word2.substring(0, vowelIndex2);
        String suffix2 = word2.substring(vowelIndex2);

        String spoonerizedWord1 = prefix2 + suffix1;
        String spoonerizedWord2 = prefix1 + suffix2;

        return spoonerizedWord1 + " " + spoonerizedWord2;
    }

    public static void result() {
        Scanner scanner = new Scanner(System.in);

        String word1 = getWord(scanner, 1);
        String word2 = getWord(scanner, 2);

        String spoonerizedWords = swapConsonants(word1, word2);

        if (spoonerizedWords == null) {
            System.out.println(word1+" and "+word2+" are not good words to spoonerize.");
        } else {
            System.out.println(word1 +" and " + word2 + " spoonerized are " + spoonerizedWords);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        result();
    }
}
