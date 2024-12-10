# Kth-Largest-Element-in-an-Array
Given an integer array nums and an integer k, return the kth largest element in the array.  Note: It is the kth largest element in the sorted order, not the kth distinct element.
Explanation:
Min-Heap Logic:

The heap maintains the k largest elements seen so far.
When adding a new element, if the heap exceeds size k, the smallest element is removed using poll().
Efficiency:

Adding an element to the heap: O(log k).
Iterating over all n elements: O(n log k).
Overall time complexity: O(n log k), which is faster than sorting the array (O(n log n)).
Heap Root:

After processing all elements, the smallest element in the heap (peek()) is the kth largest in the array.
