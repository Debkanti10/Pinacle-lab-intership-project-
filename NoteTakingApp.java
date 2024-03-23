import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoteTakingApp {
    private Map<String, String> notes; // Store notes in a map (title, content)

    public NoteTakingApp() {
        notes = new HashMap<>();
    }

    public void addNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter note title:");
        String title = scanner.nextLine();
        System.out.println("Enter note content:");
        String content = scanner.nextLine();
        notes.put(title, content);
        System.out.println("Note added successfully!");
    }

    public void viewNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter note title to view:");
        String title = scanner.nextLine();
        String content = notes.get(title);
        if (content != null) {
            System.out.println("Note content:");
            System.out.println(content);
        } else {
            System.out.println("Note not found.");
        }
    }

    // Implement methods for editing, deleting, and organizing notes

    public static void main(String[] args) {
        NoteTakingApp app = new NoteTakingApp();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a note");
            System.out.println("2. View a note");
            // Add options for editing, deleting, organizing notes, etc.
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    app.addNote();
                    break;
                case 2:
                    app.viewNote();
                    break;
                // Add cases for other options
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
