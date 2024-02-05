import java.util.ArrayList;
import java.util.Scanner;

public class list_contains_odd {
    boolean containsOddNumbers(ArrayList<Integer> nums) {
        for (int i : nums) {
            if (i % 2 != 0) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        list_contains_odd ans = new list_contains_odd();

        while (true) {
            String userInput = sc.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println(ans.containsOddNumbers(nums));
                System.out.println("Entered List: " + nums.toString());
                sc.close();
                break;
            }

            try {
                int number = Integer.parseInt(userInput);
                nums.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or type 'exit' to stop.");
            }
        }
    }
}
