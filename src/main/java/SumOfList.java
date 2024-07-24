import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int input;

        while (true) {
            System.out.print("Enter an integer (or enter 0 to stop): ");
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        int sum = getSum(numbers);
        System.out.println("The sum of the list is: " + sum);
        scanner.close();
    }

    public static int getSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
