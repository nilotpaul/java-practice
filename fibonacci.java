import java.util.Scanner;

public class fibonacci {

    boolean isFibonacci(int[] input) {
        for (int i = 0; i <= input.length - 3; i++) {
            int curr = input[i];
            int next = input[i + 1];
            int ans = input[i + 2];

            if ((curr + next) != ans) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        fibonacci ans = new fibonacci();
        Scanner sc = new Scanner(System.in);

        try {
            String[] arr = sc.nextLine().split(" ");
            int[] nums = new int[arr.length];

            for (int i = 0; i <= arr.length - 1; i++) {
                nums[i] = Integer.parseInt(arr[i]);

            }
            System.out.println(ans.isFibonacci(nums));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}