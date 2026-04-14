
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static ArrayList<String> notes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            displayMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    addNote();
                    break;
                case 2:
                    displayNotes();
                    break;
                case 3:
                    deleteNote();
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n=== Notes Application ===");
        System.out.println("||1. Pievienot ierakstu||");
        System.out.println("||2. Apskat'it visus ierakstus||");
        System.out.println("||3. Dzest ierakstu||");
        System.out.println("||4. Iziet||");
        System.out.print("Choose an option: ");
    }

    private static int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void addNote() {
        System.out.print("Enter your note: ");
        String note = scanner.nextLine();
        if (!note.trim().isEmpty()) {
            notes.add(note);
            System.out.println("Note added successfully!");
        } else {
            System.out.println("Note cannot be empty.");
        }
    }

    private static void displayNotes() {
        if (notes.isEmpty()) {
            System.out.println("No notes yet.");
        } else {
            System.out.println("\n=== Your Notes ===");
            for (int i = 0; i < notes.size(); i++) {
                System.out.println((i + 1) + ". " + notes.get(i));
            }
        }
    }

    private static void deleteNote() {
        if (notes.isEmpty()) {
            System.out.println("No notes to delete.");
            return;
        }
        
        displayNotes();
        System.out.print("Enter the note number to delete: ");
        try {
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            if (index >= 0 && index < notes.size()) {
                notes.remove(index);
                System.out.println("Note deleted successfully!");
            } else {
                System.out.println("Invalid note number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}






