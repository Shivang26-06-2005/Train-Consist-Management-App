/**
 * Use Case 18: Linear Search for Bogie ID
 * This class demonstrates searching for a specific bogie ID
 * using a simple Linear Search algorithm.
 * @author Developer
 */
public class TrainAppJava {

    public static void main(String[] args) {
        // Header display
        System.out.println("==================================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("==================================================");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Bogie ID to search (Search Key)
        String searchId = "BG309";

        // Display all available bogie IDs
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // LINEAR SEARCH LOGIC
        // Flag to track if the ID is found
        boolean found = false;

        // Traverse each element sequentially
        for (String id : bogieIds) {
            // Compare each element with the search key using equals()
            if (id.equals(searchId)) {
                found = true;
                // Early Termination - stop once a match is found
                break;
            }
        }

        // Display result
        if (found) {
            // Match found
            System.out.println("\nBogie " + searchId + " found in train consist.");
        } else {
            // Match not found
            System.out.println("\nBogie " + searchId + " not found in train consist.");
        }

        // Completion message
        System.out.println("UC18 search completed...");
    }
}
