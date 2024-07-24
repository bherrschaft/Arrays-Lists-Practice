import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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

        if (!items.isEmpty()) {
            System.out.println("The last item is: " + items.get(items.size() - 1));
        } else {
            System.out.println("The list is empty.");
        }

        scanner.close();
    }
}
