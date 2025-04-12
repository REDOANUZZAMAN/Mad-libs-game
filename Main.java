import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String adjective;
        String noun;
        String verb;
        String creature;
        String sillyName;
        String magicalItem;
        String number;
        String exclamation;

        // Collect user input
        System.out.println("Enter an adjective: (e.g., sparkly, fearsome)");
        adjective = scanner.nextLine();
        System.out.println("Enter a noun: (e.g., wand, cheese)");
        noun = scanner.nextLine();
        System.out.println("Enter a verb (past tense): (e.g., danced, exploded)");
        verb = scanner.nextLine();
        System.out.println("Enter a creature: (e.g., dragon, goblin)");
        creature = scanner.nextLine();
        System.out.println("Enter a silly name: (e.g., Fluffy, Mr. Snuggles)");
        sillyName = scanner.nextLine();
        System.out.println("Enter a magical item: (e.g., wand, potion)");
        magicalItem = scanner.nextLine();
        System.out.println("Enter a number: (e.g., 7, 42)");
        number = scanner.nextLine();
        System.out.println("Enter an exclamation: (e.g., wow, yikes)");
        exclamation = scanner.nextLine();

        
        System.out.println("\nOnce upon a time in the " + adjective + " kingdom of " + sillyName + 
                           ", a brave " + creature + " discovered the legendary " + magicalItem + ".");
        System.out.println("\"" + exclamation + "!\" they cried, as they " + verb + " over the " + adjective + " " + noun + ".");
        System.out.println("Suddenly, " + sillyName + " appeared with " + number + " more " + creature + "s!");
        System.out.println("After a battle involving " + noun + "-throwing and " + magicalItem + "-waving, they all became best friends and opened a " +
                           adjective + " tavern called \"The " + creature + " and " + noun + ".\"");

        
        scanner.close();
    }
}