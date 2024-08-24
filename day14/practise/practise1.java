import java.util.ArrayList;

public class practise1 {
    public static boolean isMonotonic(ArrayList<Integer> nums) {
        boolean increasing = true;
        boolean decreasing = true;
        
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) > nums.get(i)) {
                increasing = false;
            } else if (nums.get(i - 1) < nums.get(i)) {
                decreasing = false;
            }
            
            // If both increasing and decreasing flags become false at any point, the list is not monotonic
            if (!increasing && !decreasing) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        System.out.println("Is nums1 monotonic? " + isMonotonic(nums1)); // Should print true
        
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(3);
        nums2.add(2);
        nums2.add(1);
        System.out.println("Is nums2 monotonic? " + isMonotonic(nums2)); // Should print true
        
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.add(1);
        nums3.add(3);
        nums3.add(2);
        System.out.println("Is nums3 monotonic? " + isMonotonic(nums3)); // Should print false
    }
}
