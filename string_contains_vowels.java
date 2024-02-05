import java.util.Scanner;

public class string_contains_vowels {
    boolean containsVowel(String input) {
        char[] pattern = { 'a', 'e', 'i', 'o', 'u' };
        char[] chars = input.toLowerCase().toCharArray();

        for (char c : chars) {
            for (char d : pattern) {
                if (c == d)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        string_contains_vowels ans = new string_contains_vowels();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(ans.containsVowel(sc.next()));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}