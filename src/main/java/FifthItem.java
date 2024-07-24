import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
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

        if (items.size() >= 5) {
            System.out.println("The fifth item is: " + items.get(4));
        } else {
            System.out.println("There are less than five items in the list.");
        }

        scanner.close();
    }
}
