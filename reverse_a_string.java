import java.util.Scanner;

public class reverse_a_string {

    String reverse(String input) {
        if (input.length() <= 2) {
            throw new Error("Enter a string");
        }

        StringBuilder val = new StringBuilder();

        char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            val.append(chars[i]);
        }

        return val.toString();
    }

    public static void main(String[] args) {
        reverse_a_string ans = new reverse_a_string();
        Scanner sc = new Scanner(System.in);

        try {
            String output = ans.reverse(sc.next());
            System.out.println(output);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}