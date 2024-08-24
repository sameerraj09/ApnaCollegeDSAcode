import java.util.ArrayList;

public class heap {
    static class MinHeap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1; // index of the newly added element (child)
            int par = (x - 1) / 2; // index of the parent
            while (x > 0 && arr.get(x) < arr.get(par)) {
                // Swap the child and parent if the child is smaller
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // Update indices
                x = par;
                par = (x - 1) / 2;
            }
        }

        public int getMin() {
            if (arr.size() == 0) {
                throw new IllegalStateException("Heap is empty");
            }
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i; // assume parent as the min index and compare with children

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                // Swap parent and the smallest child
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                // Heapify the affected sub-tree
                heapify(minIdx);
            }
        }

        public int delete() {
            if (arr.size() == 0) {
                throw new IllegalStateException("Heap is empty");
            }

            int data = arr.get(0); // the min value to be removed
            int lastIdx = arr.size() - 1;

            // Step 1: Swap the first and last elements
            arr.set(0, arr.get(lastIdx));
            arr.remove(lastIdx); // Step 2: Remove the last element

            // Step 3: Heapify from the root
            if (arr.size() > 0) {
                heapify(0);
            }

            return data;
        }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap();

        heap.add(5);
        heap.add(3);
        heap.add(17);
        heap.add(10);
        heap.add(84);
        heap.add(19);
        heap.add(6);
        heap.add(22);
        heap.add(9);

        System.out.println("Min element: " + heap.getMin());

        System.out.println("Deleted element: " + heap.delete());
        System.out.println("New Min element: " + heap.getMin());
    }
}
