/**
 * [cite: 1381] Use Case 20: Exception Handling During Search Operations
 * [cite: 1383] This class prevents searching if the train consist is empty 
 * by throwing a custom exception early (fail-fast behavior).
 * [cite: 1390] @author Developer
 */
public class UseCase20TrainConsistigent {

    public static void main(String[] args) {
        // [cite: 1441] Header display
        System.out.println("==================================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("==================================================");

        // [cite: 1386] Scenario 1: Empty array to trigger exception
        String[] emptyBogieIds = {};
        
        // [cite: 1386] Scenario 2: Populated array for a valid search
        String[] activeBogieIds = {"BG101", "BG205", "BG309"};
        String searchKey = "BG205";

        try {
            System.out.println("Testing Search on Empty Consist...");
            //  This call will trigger the fail-fast validation
            performSafeSearch(emptyBogieIds, searchKey);
        } catch (IllegalStateException e) {
            // [cite: 1435, 1466] Catch and display the early validation error
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("\nTesting Search on Active Consist...");
            // [cite: 1468] This call should pass validation and execute the search
            boolean found = performSafeSearch(activeBogieIds, searchKey);
            System.out.println("Bogie " + searchKey + " found: " + found);
        } catch (IllegalStateException e) {
            System.err.println("Unexpected Error: " + e.getMessage());
        }

        System.out.println("\nUC20 exception handling completed.");
    }

    /**
     * [cite: 1432, 1433] Validates data and performs search.
     * @throws IllegalStateException if the array is empty.
     */
    public static boolean performSafeSearch(String[] bogieIds, String key) {
        // [cite: 1377, 1466] FAIL-FAST VALIDATION
        // Before running search logic, ensure the data structure is not empty.
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Search failed: No bogies available in the train consist.");
        }

        // [cite: 1414, 1416] If validation passes, proceed with search logic
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }
}
