package Goldman_Sachs;

import java.util.ArrayList;

public class Missing_and_Repeating_gfg {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        int repeating = -1, missing = -1; // Initialize repeating and missing
        // Traverse the array
        for (int i = 0; i < n; i++) {
            int element = Math.abs(arr[i]); // Get the absolute value of the element
            if (arr[element - 1] < 0) { // If the element is negative
                repeating = element; // Set the repeating element
            } else {
                arr[element - 1] *= -1; // Make the element negative
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1; // Set the missing element
            }
        }

        ArrayList<Integer> result = new ArrayList<>(); // Create a list to store the result
        result.add(repeating); // Add the repeating element
        result.add(missing); // Add the missing element
        return result;
    }
}
