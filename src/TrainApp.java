/**
 * Use Case 16: Sort Passenger Bogies by Capacity
 * This class demonstrates manual sorting of passenger
 * bogie capacities using the Bubble Sort algorithm 
 * instead of built-in sorting utilities.
 */
public class TrainAppJava { [cite: 29]

    public static void main(String[] args) { [cite: 30]
        // Header display [cite: 35]
        System.out.println("==================================================");
        System.out.println(" UC16 - Manual Sorting using Bubble Sort ");
        System.out.println("==================================================");

        // Create array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 68}; [cite: 37]

        // Display original order
        System.out.println("Original Capacities:"); [cite: 39]
        for (int capacity : capacities) { [cite: 42]
            System.out.print(capacity + " ");
        }

        // BUBBLE SORT LOGIC
        // Outer Loop controls number of passes
        for (int i = 0; i < capacities.length - 1; i++) { [cite: 45]
            // Inner Loop for comparing adjacent elements
            for (int j = 0; j < capacities.length - 1 - i; j++) { [cite: 53, 62]
                
                // If left element is greater than right, swap them
                if (capacities[j] > capacities[j + 1]) {
                    // Swapping Logic using a temporary variable
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp; [cite: 55]
                }
            }
        }

        // Display sorted result
        System.out.println("\n\nSorted Capacities (Ascending):"); [cite: 47]
        for (int capacity : capacities) { [cite: 49]
            System.out.print(capacity + " ");
        }

        System.out.println("\n\nUC16 sorting completed."); [cite: 86]
    }
}
