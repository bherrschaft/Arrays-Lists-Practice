import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
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

        System.out.print("What number are you looking for? ");
        int target = scanner.nextInt();
        int index = numbers.indexOf(target);

        if (index != -1) {
            System.out.println("The index of the number " + target + " is: " + index);
        } else {
            System.out.println("The number " + target + " is not in the list.");
        }

        scanner.close();
    }
}
