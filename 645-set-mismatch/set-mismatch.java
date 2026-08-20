class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = -1;
        int missing = -1;

        // Pass 1: Iterate through the array to find the duplicate
        for (int i = 0; i < nums.length; i++) {
            // Get the absolute value to use as an index (0-based)
            int index = Math.abs(nums[i]) - 1;
            
            // If the value at this index is already negative, we've seen it before
            if (nums[index] < 0) {
                duplicate = Math.abs(nums[i]);
            } else {
                // Otherwise, mark it as seen by negating the value
                nums[index] = -nums[index];
            }
        }

        // Pass 2: Find the missing number
        for (int i = 0; i < nums.length; i++) {
            // The index that still has a positive value represents the missing number
            if (nums[i] > 0) {
                missing = i + 1;
                // Note: If the interviewer asks you not to leave the array modified, 
                // you would remove the 'break' and add: nums[i] = Math.abs(nums[i]);
                // to restore the array in this loop.
                break; 
            }
        }

        return new int[]{duplicate, missing};
    }
}