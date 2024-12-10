import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        // Create a min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the heap
        for (int num : nums) {
            minHeap.add(num);

            // Keep only the k largest elements in the heap
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // The root of the heap is the kth largest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println("Kth Largest Element: " + findKthLargest(nums1, k1)); 

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println("Kth Largest Element: " + findKthLargest(nums2, k2)); 
    }
}
