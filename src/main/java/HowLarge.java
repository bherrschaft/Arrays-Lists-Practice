import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        String input;

        while (true) {
            System.out.print("Enter a string (or press Enter to stop): ");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            items.add(input);
        }

        System.out.println("The size of the list is: " + items.size());
        scanner.close();
    }
}
