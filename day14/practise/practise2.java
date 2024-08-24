import java.util.ArrayList;
import java.util.Collections;

public class practise2 {
    public static ArrayList<Integer> lonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }
        // Handling cases for lists with size 0, 1, or 2
        if (nums.size() == 1 || nums.get(0) + 1 < nums.get(1)) {
            list.add(nums.get(0));
        }
        if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
            list.add(nums.get(nums.size() - 1));
        }
        return list;
    }

    public static void main(String[] args) {
        // Example usage:
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(7);
        nums.add(9);
        nums.add(10);
        nums.add(12);
        nums.add(14);
        nums.add(16);

        ArrayList<Integer> lonelyNumbers = lonely(nums);
        System.out.println("Lonely Numbers: " + lonelyNumbers);
    }
}
