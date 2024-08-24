import java.util.*;

public class heapsort {
    
    // Function to maintain the max heap property
    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1; // index of left child
        int right = 2 * i + 2; // index of right child
        int maxindx = i; // initialize max index as root

        // If left child is larger than root
        if (left < size && arr[left] > arr[maxindx]) {
            maxindx = left;
        }

        // If right child is larger than maxindx so far
        if (right < size && arr[right] > arr[maxindx]) {
            maxindx = right;
        }

        // If maxindx is not root
        if (maxindx != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[maxindx];
            arr[maxindx] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, maxindx, size);
        }
    }

    // Function to perform heap sort
    public static void heapsort(int arr[]) {
        int n = arr.length; // Get the length of the array

        // Step 1: Build the max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // Step 2: Extract elements one by one from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root (largest) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, 0, i);
        }
    }

    // Main method to test the heap sort implementation
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 4, 9}; // Input array
        heapsort(arr); // Sort the array using heap sort
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
