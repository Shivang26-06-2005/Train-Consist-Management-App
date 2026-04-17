import java.util.Arrays;

/**
 * Use Case 19: Binary Search for Bogie ID
 * This class demonstrates searching for a specific bogie ID 
 * using the Binary Search algorithm on sorted data.
 */
public class TrainAppJava {

    public static void main(String[] args) {
        // Header display
        System.out.println("==================================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("==================================================");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Binary Search precondition: The data MUST be sorted
        Arrays.sort(bogieIds);

        // Search key
        String searchKey = "BG309";

        // Display sorted available bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // --- BINARY SEARCH LOGIC ---
        // Initialize boundary indexes
        int low = 0;
        int high = bogieIds.length - 1;
        int resultIndex = -1;

        // Repeat until found or range is exhausted
        while (low <= high) {
            // Find the middle index
            int mid = low + (high - low) / 2;

            // Compare search key with middle value lexicographically
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                // Match found at mid
                resultIndex = mid;
                break;
            } else if (comparison > 0) {
                // Key is in the right half
                low = mid + 1;
            } else {
                // Key is in the left half
                high = mid - 1;
            }
        }

        // Display search result
        if (resultIndex != -1) {
            System.out.println("\nBogie " + searchKey + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + searchKey + " not found using Binary Search.");
        }

        System.out.println("\nUC19 search completed...");
    }
}
