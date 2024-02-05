import java.util.Scanner;

/**
 * is_prime
 */
public class is_prime {

    boolean isPrime(int input) {
        if (input == 0 || input == 1) {
            return false;
        }

        if (input == 2) {
            return true;
        }

        for (int i = 2; i <= input / 2; i++) {
            if (input % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        is_prime ans = new is_prime();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(ans.isPrime(sc.nextInt()));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}