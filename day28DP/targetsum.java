import java.util.ArrayList;

public class targetsum {
    public static boolean subset(int nums[], int target, int i, ArrayList<Integer> ans) {
        // Base case: if we have considered all elements
        if (i == nums.length) {
            // Check if the sum of the current subset equals the target
            if (target == sum1(ans)) {
                return true;
            }
            return false; // If not equal, return false
        }
        
        // Include the current element in the subset
        ans.add(nums[i]);
        if (subset(nums, target, i + 1, ans)) {
            return true; // If including the element leads to a valid subset, return true
        }
        
        // Exclude the current element from the subset (backtrack)
        ans.remove(ans.size() - 1);
        if (subset(nums, target, i + 1, ans)) {
            return true; // If excluding the element leads to a valid subset, return true
        }
        
        return false; // If neither including nor excluding the element works, return false
    }

    // Helper function to compute the sum of elements in the list
    public static int sum1(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        System.out.println(subset(nums, 10, 0, new ArrayList<>()));
    }
}
