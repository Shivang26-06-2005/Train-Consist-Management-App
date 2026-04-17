import java.util.Arrays;

/**
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 * This class demonstrates sorting of bogie type names 
 * alphabetically using Java's built-in Arrays.sort() method.
 */
public class TrainAppJava {

    public static void main(String[] args) {
        // Header display
        System.out.println("==================================================");
        System.out.println(" UC17 - Sort Bogie Names Using Arrays.sort() ");
        System.out.println("==================================================");

        // Create an array of bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Display original order
        // Print using Arrays.toString() for concise output
        System.out.println("\nOriginal Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Use Arrays.sort() for optimized sorting
        // This uses Dual-Pivot Quicksort or TimSort internally
        Arrays.sort(bogieNames);

        // Display sorted result (Alphabetical)
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        // Completion message
        System.out.println("\nUC17 sorting completed....");
    }
}
