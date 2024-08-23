class Solution {
    public int removeElement(int[] nums, int val) {
       int k = 0;  // Pointer for storing the count of elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, retain it
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;  // Increment k since we found a valid element
            }
        }

        // k is the number of elements not equal to val
        return k; 
    }
}